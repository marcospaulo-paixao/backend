package br.com.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.model.Usuario;
import br.com.backend.repository.UsuarioRepository;

@RestController
@RequestMapping("/user")
public class UsuarioRest {

	@Autowired
	UsuarioRepository dao;

	@GetMapping
	public List<Usuario> get() {
		return dao.findAll();
	}

	@PostMapping
	public void post(@RequestBody Usuario user) {
		dao.save(user);
	}

}
