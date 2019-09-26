package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Role;

public interface IRolService {
	
	public List<Role> findAll();

	public void save(Role cliente);
	
	public Role findOne(Long id);
	
	public void delete(Long id);
	
}
