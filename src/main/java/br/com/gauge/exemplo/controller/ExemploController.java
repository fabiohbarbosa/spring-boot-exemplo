package br.com.gauge.exemplo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("exemplo")
public class ExemploController {
	
	@RequestMapping( value = "/hello", 
					 method = RequestMethod.GET, 
					 produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<String> hello( ) {
		
		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
		
    }

}
