package br.com.alura.forum.config.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import br.com.alura.forum.models.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {
	
	@Value("${forum.jwt.expiration}")
	private String expiration;
	
	@Value("${forum.jwt.secret}")
	private String secret;

	public String gerarToken(Authentication authentication) {
		
		Usuario loggedUser = (Usuario) authentication.getPrincipal();
		
		Date today = new Date();
		@SuppressWarnings("deprecation")
		Date dateExpiration = new Date(today.getTime() + Long.parseLong(expiration));
		
		return Jwts.builder()
				.setIssuer("API-Forum-Alura")
				.setSubject(loggedUser.getId().toString())
				.setIssuedAt(today)
				.setExpiration(dateExpiration)
				.signWith(SignatureAlgorithm.HS256, secret)
				.compact();
	}

	public boolean isValid(String token) {
		
		try {
			Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
