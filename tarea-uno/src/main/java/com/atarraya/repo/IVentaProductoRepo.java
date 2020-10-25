package com.atarraya.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.atarraya.model.VentaProducto;


public interface IVentaProductoRepo extends JpaRepository<VentaProducto, Integer> {
	
	@Modifying
	@Query(value = "INSERT INTO venta_producto(id_venta, id_producto) VALUES (:idVenta, :idProducto)", nativeQuery = true)
	Integer registrar(@Param("idVenta") Integer idVenta, @Param("idProducto") Integer idProducto);
	
	@Query("from VentaProducto vp where vp.venta.idVenta = :idVenta")
	List<VentaProducto> listarProductosPorVenta(@Param("idVenta") Integer idventa);
}
