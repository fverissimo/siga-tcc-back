package com.verissimo.siga.usuario.usuarioRestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verissimo.siga.model.Usuario;
import com.verissimo.siga.services.UsuarioService;

@RestController
public class UsuarioRest {
	@Autowired
	private UsuarioService usuarioService;
	
	
	@GetMapping("/lista-usuarios")
	public List<Usuario> fetchUsuarioList(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		//logica paa buscar a lista no banco
		usuarios = usuarioService.fetchUsuarioList();
		return usuarios;
	}

}
