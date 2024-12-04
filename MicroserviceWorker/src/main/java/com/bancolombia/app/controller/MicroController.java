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

import com.bancolombia.app.entities.Worker;
import com.bancolombia.app.services.IService;

@RestController
@RequestMapping("/worker")
public class MicroController {
	
	@Autowired
	private IService service;
	
	@PostMapping
	public ResponseEntity<String> insert(@RequestBody Worker worker){
		try {
			if(service.insert(worker)) {
				return new ResponseEntity<String>("Empleado insertado", HttpStatus.CREATED);
			}
			return new ResponseEntity<String>("No insertado", HttpStatus.BAD_REQUEST);
		}catch(Exception ex){
			return new ResponseEntity<String>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping
    public ResponseEntity<List<Worker>> getAll(){
        return new ResponseEntity<List<Worker>>(service.getAll(), HttpStatus.OK);
    }

}
