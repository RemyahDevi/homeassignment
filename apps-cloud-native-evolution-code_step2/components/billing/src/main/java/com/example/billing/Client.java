package com.example.billing;


import org.springframework.http.*;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;


public class Client {

    private final RestOperations restTemplate;

    public Client(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void billUser(String userId, int amount) {

        System.out.println("Inside bill user");
        //set your headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        //set your entity to send
        HttpEntity entity = new HttpEntity(amount,headers);
        // send it!
        ResponseEntity<String> out = restTemplate.exchange("//billing/reocurringPayment", HttpMethod.POST, entity
                , String.class);


        //restTemplate.postForEntity("http://billing/reocurringPayment", amount, String.class);
    }
}