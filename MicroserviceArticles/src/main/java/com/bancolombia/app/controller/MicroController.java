package com.bancolombia.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.app.entities.Article;
import com.bancolombia.app.services.IServices;

@RestController
@RequestMapping("/article")
public class MicroController {
	
	@Autowired
	private IServices servicio;
	
	@PostMapping
	public ResponseEntity<String> insert(@RequestBody Article article){
		if(servicio.insert(article))
			return new ResponseEntity<String>("Artículo insertado", HttpStatus.CREATED);
		
			return new ResponseEntity<String>("Error de inserción", HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping
	public ResponseEntity<List<Article>> get(){
		return new ResponseEntity<List<Article>>(servicio.getAll(), HttpStatus.OK);
	}
	

}
