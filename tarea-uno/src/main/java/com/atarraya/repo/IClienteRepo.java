package com.atarraya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atarraya.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer>{

}
