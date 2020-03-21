package com.uabc.edu.mx.examen.service;

import com.uabc.edu.mx.examen.model.Animal;
import com.uabc.edu.mx.examen.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public  Animal createAnimal(Animal ani){
        if (ani.getIdAnimal() == null){
            ani = repository.save(ani);
            return ani;
        }else{
            Optional<Animal> an = repository.findById(ani.getIdAnimal());

            if(an.isPresent()){
                Animal newAnimal = an.get();
                newAnimal.setTipoAnimal(ani.getTipoAnimal());
                newAnimal.setRazaAnimal(ani.getRazaAnimal());
                newAnimal.setColorAnimal(ani.getColorAnimal());
                newAnimal.setPelajeAnimal(ani.getPelajeAnimal());
                newAnimal.setFechaNacimientoAnimal(ani.getFechaNacimientoAnimal());
                newAnimal.setVacunasAnimal(ani.getVacunasAnimal());
                newAnimal.setAdoptanteAnimal(ani.getAdoptanteAnimal());
                newAnimal.setEstadoAnimal(ani.getEstadoAnimal());

                newAnimal = repository.save(newAnimal);
                return newAnimal;
            }else{
                ani = repository.save(ani);
                return  ani;
            }
        }
    }

}
