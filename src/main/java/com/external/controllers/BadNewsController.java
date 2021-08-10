
package com.external.controllers;

import com.external.AnswerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BadNewsController {
    
    @Autowired
    private Environment env;
    
    @Value("${app.news.bad.path}")
    String badNewsPath;
    
    @GetMapping(path = "/bad-news", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity badNews() {
        AnswerDTO answer = new AnswerDTO(badNewsPath, env.getProperty("app.news.bad.message"));
        
    return new ResponseEntity(answer, HttpStatus.OK);

    }

}
