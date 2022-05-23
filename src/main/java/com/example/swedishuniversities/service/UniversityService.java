package com.example.swedishuniversities.service;

import com.example.swedishuniversities.model.SimpleUniversity;
import com.example.swedishuniversities.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {

    @Autowired
    UniversityRepository universityRepository;



    public List<SimpleUniversity> getSimpleUniversities(){

        return  universityRepository.getSimpleUniversities();
    }

}
