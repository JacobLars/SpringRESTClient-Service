package com.example.swedishuniversities.repository;

import com.example.swedishuniversities.model.SimpleUniversity;
import com.example.swedishuniversities.model.University;
import com.example.swedishuniversities.rest.client.UniversitiesRestClient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UniversityRepository {


    UniversitiesRestClient universitiesRestClient = new UniversitiesRestClient();
    SimpleUniversity simpleUniversity;
    List<SimpleUniversity> universities = new ArrayList<>();

    public List<University> getAllUniversities(){

      return universitiesRestClient.getAllSwedishUniversities();

    }


    public List<SimpleUniversity> getSimpleUniversities(){

        for (int i = 0; i < getAllUniversities().size(); i++) {
            simpleUniversity = new SimpleUniversity(
                    getAllUniversities().get(i).getCountry(),
                    getAllUniversities().get(i).getName(),
                    getAllUniversities().get(i).getDomains(),
                    getAllUniversities().get(i).getWebPages());
            universities.add(simpleUniversity);
        }

        return universities;
    }

}
