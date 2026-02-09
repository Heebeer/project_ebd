package br.com.ebd.ebd.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ebd.ebd.domain.Congregacao;

public interface CongregacaoRepository extends JpaRepository<Congregacao, Long> {

    Optional<Congregacao> findByCodigo(String codigo);

}

