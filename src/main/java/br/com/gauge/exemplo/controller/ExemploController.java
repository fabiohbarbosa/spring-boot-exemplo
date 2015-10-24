package br.com.gauge.exemplo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exemplo")
public class ExemploController {
    @RequestMapping(value = "/hello/text", method = RequestMethod.GET,
            produces = MediaType.TEXT_HTML_VALUE)
    public String hello() {
        return "Hello World";
    }

    @RequestMapping(value = "/hello/json", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody HelloDTO helloJson() {
        return new HelloDTO("Hello World");
    }


}
