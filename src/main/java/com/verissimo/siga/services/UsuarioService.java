package com.verissimo.siga.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verissimo.siga.model.Usuario;
import com.verissimo.siga.repo.UsuarioRepo;	

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepo repo;
	
	public List <Usuario>fetchUsuarioList(){				
		return repo.findAll();
	}
}
