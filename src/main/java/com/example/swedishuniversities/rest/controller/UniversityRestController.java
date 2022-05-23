package com.example.swedishuniversities.rest.controller;

import com.example.swedishuniversities.model.SimpleUniversity;
import com.example.swedishuniversities.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UniversityRestController {


    @Autowired
    UniversityService universityService;

    @GetMapping("rest")
    public List<SimpleUniversity> getAllUniversities(){

        return universityService.getSimpleUniversities();
    }

}
