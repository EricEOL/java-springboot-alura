package br.com.alura.forum.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alura.forum.models.Curso;
import br.com.alura.forum.models.Topico;

@Controller
public class TopicosController {

	@RequestMapping("/topicos")
	@ResponseBody
	public List<Topico> listar() {

		Topico topico = new Topico("Dúvida Java", "Não consigo sei lá oque", new Curso("Java", "Programação"));
		
		/*List<Topico> topicos = new ArrayList<Topico>();
		topicos.add(topico);*/

		return Arrays.asList(topico, topico, topico);

	}

}
