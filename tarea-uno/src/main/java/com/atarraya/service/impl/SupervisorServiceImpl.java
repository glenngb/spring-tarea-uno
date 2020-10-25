package com.atarraya.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atarraya.model.Supervisor;
import com.atarraya.repo.ISupervisorRepo;
import com.atarraya.service.ISupervisorService;

@Service
public class SupervisorServiceImpl implements ISupervisorService {
	
	@Autowired
	private ISupervisorRepo repo;
	
	@Override
	public Supervisor registrar(Supervisor obj) {
		return repo.save(obj);
	}
	
	@Override
	public Supervisor modificar(Supervisor obj) {
		return repo.save(obj);
	}
	
	@Override
	public List<Supervisor> listar(){
		return repo.findAll();
	}
	
	@Override
	public Supervisor leerPorId (Integer id){
		Optional<Supervisor> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Supervisor(); 
		}
	
	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}
}
