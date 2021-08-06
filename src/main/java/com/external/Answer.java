
package com.external;

import java.util.Date;

public class Answer {
    
    String endpoint;
    String message;
    Date timestamp;
    
    public Answer(String endpoint, String message) {
        this.endpoint = endpoint;
        this.message = message;
        this.timestamp = new Date();
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
    
    
}
