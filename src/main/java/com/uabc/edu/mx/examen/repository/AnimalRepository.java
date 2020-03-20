package com.uabc.edu.mx.examen.repository;

import com.uabc.edu.mx.examen.model.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {
}
