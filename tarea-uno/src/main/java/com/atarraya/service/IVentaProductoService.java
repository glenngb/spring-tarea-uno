package com.atarraya.service;

import java.util.List;

import com.atarraya.model.VentaProducto;


public interface IVentaProductoService {
	List<VentaProducto> listarProductoPorVenta(Integer idVenta);
}
