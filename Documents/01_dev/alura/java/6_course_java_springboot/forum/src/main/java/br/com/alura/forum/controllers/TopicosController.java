package br.com.alura.forum.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controllers.DTO.TopicoDTO;
import br.com.alura.forum.models.Topico;
import br.com.alura.forum.repositories.TopicoRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;

	@GetMapping("/topicos")
	public List<TopicoDTO> listar(String curso) {
		
		if(curso == null) {
			List<Topico> topicos = topicoRepository.findAll();
			
			return TopicoDTO.converter(topicos);
		} else {
			List<Topico> topicos = topicoRepository.findByCursoNome(curso);
			
			return TopicoDTO.converter(topicos);
		}

	}

}
