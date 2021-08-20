
package com.externalConfig.controllers;

import com.externalConfig.model.AnswerDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BadNewsController {
    
    @Value("${app.news.bad.message}")
    private String badMessage;
    
    @Value("${app.news.bad.path}")
    private String badNewsPath;
    
    @GetMapping(path = "/bad-news", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity badNews() throws InterruptedException {
        AnswerDTO answer = new AnswerDTO(badNewsPath, badMessage);
//        Thread.sleep(5000);
    return new ResponseEntity(answer, HttpStatus.OK);

    }

}
