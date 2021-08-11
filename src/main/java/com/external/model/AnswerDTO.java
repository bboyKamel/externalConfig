
package com.external.model;

import java.util.Date;
import lombok.Getter;

@Getter
public class AnswerDTO {
    
    private String endpoint;
    private String message;
    private Date timestamp;
    
    public AnswerDTO(String endpoint, String message) {
        this.endpoint = endpoint;
        this.message = message;
        this.timestamp = new Date();
    }
}
