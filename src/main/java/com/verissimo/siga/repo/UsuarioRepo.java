package com.verissimo.siga.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.verissimo.siga.model.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, Integer>{

	
}
