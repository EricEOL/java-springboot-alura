package br.com.alura.forum.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controllers.DTO.TopicoDTO;
import br.com.alura.forum.models.Curso;
import br.com.alura.forum.models.Topico;
import br.com.alura.forum.repositories.TopicoRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;

	@RequestMapping("/topicos")
	public List<TopicoDTO> listar() {
		
		List<Topico> topicos = topicoRepository.findAll();
		
		return TopicoDTO.converter(topicos);

	}

}
