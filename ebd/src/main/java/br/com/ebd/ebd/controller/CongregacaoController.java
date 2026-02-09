package br.com.ebd.ebd.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ebd.ebd.domain.Congregacao;
import br.com.ebd.ebd.service.CongregacaoService;

@RestController
@RequestMapping("/congregacoes")
public class CongregacaoController {

    private final CongregacaoService service;

    public CongregacaoController(CongregacaoService service) {
        this.service = service;
    }

    @PostMapping
    public Congregacao criar(@RequestBody Congregacao congregacao) {
        return service.salvar(congregacao);
    }

    @GetMapping
    public List<Congregacao> listar() {
        return service.listar();
    }
}
