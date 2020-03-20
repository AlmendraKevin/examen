package com.uabc.edu.mx.examen.service;

import com.uabc.edu.mx.examen.model.Animal;
import com.uabc.edu.mx.examen.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {
    @Autowired
    AnimalRepository repository;
    public List<Animal> getAllData(){
        List<Animal> result = (List<Animal>) repository.findAll();
        if (result.size()>0){
            return result;
        }else{
            return new ArrayList<Animal>();
        }
    }
}
