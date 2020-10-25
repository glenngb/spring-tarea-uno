package com.atarraya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atarraya.model.Venta;

public interface IVentaRepo extends JpaRepository<Venta, Integer>{

}
