package br.com.gauge.exemplo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "exemplo/")
public class ExemploController {
	
	@RequestMapping("/hello/{name}")
    String hello( @PathVariable String name ) {
        return "Hello, " + name + "!";
    }

}
