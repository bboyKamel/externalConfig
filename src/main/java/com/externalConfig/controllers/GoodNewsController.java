
package com.externalConfig.controllers;

import com.externalConfig.model.AnswerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodNewsController {
    
    @Autowired
    private Environment env;
    
    @Value("${app.news.good.path}")
    private String goodNewsPath;
    
    @GetMapping(path = "/good-news", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity goodNews() {   
        AnswerDTO answer = new AnswerDTO(goodNewsPath, env.getProperty("app.news.good.message"));
    
    return new ResponseEntity(answer, HttpStatus.OK);
    }
}
