package com.atarraya.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atarraya.model.VentaProducto;
import com.atarraya.repo.IVentaProductoRepo;
import com.atarraya.service.IVentaProductoService;

@Service
public class VentaProductoServiceImpl implements IVentaProductoService{
	@Autowired
	private IVentaProductoRepo repo;
	
	@Override
	public List<VentaProducto>listarProductoPorVenta(Integer idventa){
		return repo.listarProductosPorVenta(idventa);
	}

}
