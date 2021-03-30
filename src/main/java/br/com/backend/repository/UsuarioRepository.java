package br.com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.backend.model.Usuario;
import br.com.backend.model.UsuarioId;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UsuarioId> {

}