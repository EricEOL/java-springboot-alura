package br.com.alura.forum.controllers;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controllers.form.LoginForm;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
	
	@PostMapping
	public ResponseEntity<?> autenticar(@RequestBody @Valid LoginForm form) {
		
		System.out.println(form.getEmail());
		System.out.println(form.getSenha());
		
		return ResponseEntity.ok().build();
	}
	
}
