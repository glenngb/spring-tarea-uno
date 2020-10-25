package com.atarraya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atarraya.model.Supervisor;

public interface ISupervisorRepo extends JpaRepository<Supervisor, Integer> {

}
