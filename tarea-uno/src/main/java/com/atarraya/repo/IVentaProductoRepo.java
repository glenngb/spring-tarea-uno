package com.atarraya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atarraya.model.VentaProducto;

public interface IVentaProductoRepo extends JpaRepository<VentaProducto, Integer> {

}
