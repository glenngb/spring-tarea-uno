package com.atarraya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atarraya.model.Marca;

public interface IMarcaRepo extends JpaRepository<Marca, Integer> {

}
