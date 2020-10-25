package com.atarraya.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.atarraya.model.VentaProducto;
import com.atarraya.service.IVentaProductoService;

@RestController
@RequestMapping("/ventasproductos")
public class VentaProductoController {
	
	@Autowired
	private IVentaProductoService service;
	
	@GetMapping(value = "/{idVenta}")
	public ResponseEntity<List<VentaProducto>> listar(@PathVariable("idVenta") Integer idventa) {
		List<VentaProducto> ventaproducto = new ArrayList<>();
		ventaproducto = service.listarProductoPorVenta(idventa);
		return new ResponseEntity<List<VentaProducto>>(ventaproducto, HttpStatus.OK);
	}
}
