package br.com.alura.forum.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controllers.DTO.TopicoDTO;
import br.com.alura.forum.models.Curso;
import br.com.alura.forum.models.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<TopicoDTO> listar() {

		Topico topico = new Topico("Dúvida Java", "Não consigo sei lá oque", new Curso("Java", "Programação"));
		
		return TopicoDTO.converter(Arrays.asList(topico, topico, topico, topico));

	}

}
