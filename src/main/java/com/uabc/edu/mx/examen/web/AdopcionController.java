package com.uabc.edu.mx.examen.web;

import com.uabc.edu.mx.examen.model.Animal;
import com.uabc.edu.mx.examen.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/adoptar")
public class AdopcionController {

    @Autowired
    private AnimalService service;

    @RequestMapping
    public String adoptar(Model model){
        List<Animal> animal = service.getAnimals();
        List<Animal> animalAux = new ArrayList<Animal>();
        animal.forEach(animal1 -> {
            if(!animal1.isEstadoAnimal()){
                animalAux.add(animal1);
            }
        });

        model.addAttribute("animal", animalAux);
        return "adopcion";
    }
    @RequestMapping(path = { "/adopcion/{id}" })
    public String editAnimalById(Model model, @PathVariable(value = "id", required = true) Long id) {
        Animal animal = service.getAnimalById(id);
        model.addAttribute("animal", animal);
        return "adopcionFormato";
    }
    @RequestMapping(path = "/adoptarAnimal", method = RequestMethod.POST)
    public String saveOrUpdateAnimal(@RequestParam(value = "idAnimal", required = false) Optional<Long> id,
                                     @RequestParam(value = "tipoAnimal", required = true) String tipo,
                                     @RequestParam(value = "razaAnimal", required = true) String raza,
                                     @RequestParam(value = "colorAnimal", required = true) String color,
                                     @RequestParam(value = "pelajeAnimal", required = true) String pelaje,
                                     @RequestParam(value = "fechaNacimientoAnimal", required = true) String fecha,
                                     @RequestParam(value = "vacunaAnimal", required = false, defaultValue = "false") boolean vacunado,
                                     @RequestParam(value = "estadoAnimal", required = false, defaultValue = "false") boolean adoptado,
                                     @RequestParam(value = "nombreAdoptante", required = false) String responsable,
                                     @RequestParam(value = "img", required = false) MultipartFile img) {

        Animal entity;

        if (id.isPresent()) {
            entity = service.getAnimalById(id.get());
        } else{
            entity = new Animal(); //empty entity
        }
        entity.setTipoAnimal(tipo);
        entity.setRazaAnimal(raza);
        entity.setColorAnimal(color);
        entity.setPelajeAnimal(pelaje);
        entity.setFechaNacimientoAnimal(fecha);
        entity.setVacunaAnimal(vacunado);
        entity.setEstadoAnimal(true);
        entity.setNombreAdoptante(responsable);
        entity.setImg(entity.getImg());
        entity.setStr(entity.getStr());
        service.saveAnimal(entity); //SAVE OR UPDATE SERVICE
        return "redirect:/";
    }


}
