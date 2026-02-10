package br.com.ebd.ebd.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.ebd.ebd.domain.Congregacao;
import br.com.ebd.ebd.domain.Usuario;
import br.com.ebd.ebd.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository usuarioRepository,
                          PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Usuario criarUsuario(String username, String senha, Congregacao congregacao) {
        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setPassword(passwordEncoder.encode(senha));
        usuario.setRole("ROLE_CONGREGACAO");
        usuario.setCongregacao(congregacao);
        return usuarioRepository.save(usuario);
    }
}
