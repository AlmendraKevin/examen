package com.uabc.edu.mx.examen.service;

import com.uabc.edu.mx.examen.model.Animal;
import com.uabc.edu.mx.examen.repository.AnimalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AnimalService {
    @Autowired
    AnimalRepository repository;

    public List<Animal> getAnimals(){
        return (List<Animal>) repository.findAll();
    }



    public Animal getAnimalById(Long id){
        Optional<Animal> animal = repository.findById(id);
        if (animal.isPresent()){
            return repository.findById(id).get();
        }
        return animal.get();
    }

    public Animal saveAnimal(Animal a){
        if (a.getIdAnimal()==null){
            a = repository.save(a);
            return a;
        }else{
            Optional<Animal> animal = repository.findById(a.getIdAnimal());
            if(animal.isPresent()){
                Animal newAnimal = animal.get();
                newAnimal.setIdAnimal(a.getIdAnimal());
                newAnimal.setTipoAnimal(a.getTipoAnimal());
                newAnimal.setRazaAnimal(a.getRazaAnimal());
                newAnimal.setColorAnimal(a.getColorAnimal());
                newAnimal.setPelajeAnimal(a.getPelajeAnimal());
                newAnimal.setFechaNacimientoAnimal(a.getFechaNacimientoAnimal());
                newAnimal.setVacunaAnimal(a.isVacunaAnimal());
                newAnimal.setEstadoAnimal(a.isEstadoAnimal());
                newAnimal.setNombreAdoptante(a.getNombreAdoptante());
                newAnimal.setImg(a.getImg());


                newAnimal=repository.save(newAnimal);
                return newAnimal;
            }else {
                a = repository.save(a);
                return a;
            }
        }
    }

    public void deleteAnimal(Long id){
        Optional<Animal> animal =repository.findById(id);
        if(animal.isPresent()){
          repository.deleteById(id);
        }
    }

}
