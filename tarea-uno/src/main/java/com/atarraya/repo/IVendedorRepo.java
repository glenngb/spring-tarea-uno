package com.atarraya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atarraya.model.Vendedor;

public interface IVendedorRepo extends JpaRepository<Vendedor, Integer>{

}
