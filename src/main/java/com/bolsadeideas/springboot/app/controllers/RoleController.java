package com.bolsadeideas.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.app.models.entity.Role;
import com.bolsadeideas.springboot.app.models.service.IRolService;

@RestController
public class RoleController {

	@Autowired
	private IRolService roleService;
	

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public List<Role> listar(Model model) {
		List<Role> roles = roleService.findAll();
		

		return roles;
	}

}