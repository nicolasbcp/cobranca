package com.gft.cobranca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.cobranca.model.Titulo;

@Repository
public interface Titulos extends JpaRepository<Titulo, Long> {
	List<Titulo> findByDescricaoContaining(String busca);
}
