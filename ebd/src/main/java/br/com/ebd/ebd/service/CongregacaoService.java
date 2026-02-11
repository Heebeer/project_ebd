package br.com.ebd.ebd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.ebd.ebd.domain.Congregacao;
import br.com.ebd.ebd.repository.CongregacaoRepository;

@Service
public class CongregacaoService {

    private final CongregacaoRepository repository;

    public CongregacaoService(CongregacaoRepository repository) {
        this.repository = repository;
    }

    public Congregacao salvar(Congregacao congregacao) {
        return repository.save(congregacao);
    }

    public List<Congregacao> listar() {
        return repository.findAll();
    }

    public Congregacao criar(String nome) {
        Congregacao c = new Congregacao();
        c.setNome(nome);
        String codigo = nome == null ? "" : nome.toLowerCase().replaceAll("\\s+", "_");
        c.setCodigo(codigo);
        return salvar(c);
    }
}
