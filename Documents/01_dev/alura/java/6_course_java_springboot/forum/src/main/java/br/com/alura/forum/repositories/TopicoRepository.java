package br.com.alura.forum.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.forum.models.Topico;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {}