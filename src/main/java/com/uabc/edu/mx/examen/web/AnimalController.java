package com.uabc.edu.mx.examen.web;

import com.uabc.edu.mx.examen.model.Animal;
import com.uabc.edu.mx.examen.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
@Controller
@RequestMapping("/control")
public class AnimalController {

    @Autowired
    private AnimalService service;

    @RequestMapping //class no path + method no path  = home index
    public String getAnimals(Model model) { //adds the model to load atributes in the html template
        List<Animal> animal = service.getAnimals();
        model.addAttribute("animal", animal);
        return "search";

    }

    @RequestMapping("/new") //displays empty form
    public String getAdmin(Model model) {// model to hold data on the frontend
        model.addAttribute("animal", new Animal());
        return "formCreate";
    }
    @RequestMapping("/up")
    public String update(){
       return "formCreate";
    }

    @RequestMapping(path = { "/update/{id}" })
    public String editAnimalById(Model model, @PathVariable(value = "id", required = true) Long id) {
        Animal animal = service.getAnimalById(id);
        model.addAttribute("animal", animal);
        return "formCreate";
    }

    @GetMapping("/delete/{id}")
    public String deleteAnimal(@PathVariable("id") Long id) {
        service.deleteAnimal(id);
        return "redirect:/control";
    }
    @RequestMapping(path = "/saveAnimal", method = RequestMethod.POST)
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
        entity.setEstadoAnimal(adoptado);
        entity.setNombreAdoptante(responsable);
        try {
            entity.setImg(img.getBytes()); //MultipartFile to byte[] and stored as longblob
        } catch (Exception e) {
            System.out.println("SAVE ANIMAL ERROR: >>> " + e); //conversion failed
        }
        service.saveAnimal(entity); //SAVE OR UPDATE SERVICE
        return "redirect:/control";
    }





}
