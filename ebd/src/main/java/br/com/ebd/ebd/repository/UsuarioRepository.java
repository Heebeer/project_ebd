package br.com.ebd.ebd.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ebd.ebd.domain.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
}
