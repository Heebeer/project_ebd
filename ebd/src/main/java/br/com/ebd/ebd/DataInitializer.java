package br.com.ebd.ebd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.ebd.ebd.domain.Congregacao;
import br.com.ebd.ebd.service.CongregacaoService;
import br.com.ebd.ebd.service.UsuarioService;

@Component
public class DataInitializer implements CommandLineRunner {

    private final CongregacaoService congregacaoService;
    private final UsuarioService usuarioService;

    public DataInitializer(CongregacaoService congregacaoService,
                           UsuarioService usuarioService) {
        this.congregacaoService = congregacaoService;
        this.usuarioService = usuarioService;
    }

    @Override
    public void run(String... args) {

        Congregacao steffen = congregacaoService.criar("Steffen");

        usuarioService.criarUsuario(
            "steffen_admin",
            "123456",
            steffen
        );
    }
}
