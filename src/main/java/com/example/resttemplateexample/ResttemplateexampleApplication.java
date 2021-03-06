package com.example.resttemplateexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ResttemplateexampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResttemplateexampleApplication.class, args);

        RestTemplate resttemplate= new RestTemplate();

//        Notes are here : ResponseEntity is meant to represent the entire HTTP response.
//        You can control anything that goes into it: status code, headers, and body

        ResponseEntity<String> response= resttemplate.getForEntity("http://localhost:8080/getAllEmployee",String.class);
        String body =response.getBody();
        MediaType contentType = response.getHeaders().getContentType();
        HttpStatus statusCode = response.getStatusCode();
        

        ResponseEntity<String> response1 = resttemplate.getForEntity("http://localhost:8080/addEmployee",String.class);
        String entity1=response1.getBody();
        MediaType contentType1 = response.getHeaders().getContentType();
        HttpStatus statusCode1 = response.getStatusCode();

//        ResponseEntity<String> responseEntity= resttemplate.getForEntity("http://localhost:9090/addEmployee",String.class);
//        String entity2= responseEntity.getBody();
//        MediaType contentType2= responseEntity.getHeaders().getContentType();
//        HttpStatus status = responseEntity.getStatusCode();

        //deleteEmployee
        ResponseEntity<String> response2 = resttemplate.getForEntity("http://localhost:8080/deleteEmployee",String.class);
        String entity2=response1.getBody();
        MediaType contentType2 = response.getHeaders().getContentType();
        HttpStatus statusCode2 = response.getStatusCode();



    }
}
