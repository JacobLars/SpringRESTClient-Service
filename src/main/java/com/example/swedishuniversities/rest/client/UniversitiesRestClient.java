package com.example.swedishuniversities.rest.client;

import com.example.swedishuniversities.model.University;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


public class UniversitiesRestClient {

    String baseUrl = "http://universities.hipolabs.com/search?country=Sweden";
    public List<University> getAllSwedishUniversities(){

        RestTemplate restTemplate = new RestTemplate();

        ParameterizedTypeReference<List<University>> listType =
                new ParameterizedTypeReference<>() {
                };

        ResponseEntity<List<University>> response = restTemplate.exchange(
                baseUrl, HttpMethod.GET, null, listType);

        return response.getBody();
    }



}
