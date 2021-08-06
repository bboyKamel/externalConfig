package com.external;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
@Configuration
public class ExternalApplication implements WebApplicationInitializer {

        @Override
        public void onStartup(ServletContext servletContext) throws ServletException {
            System.out.println("Ustawiam Profil");
            servletContext.setInitParameter("spring.profiles.active", "DEV");
        }
        
	public static void main(String[] args) { 
		SpringApplication.run(ExternalApplication.class, args);     
	}

}
