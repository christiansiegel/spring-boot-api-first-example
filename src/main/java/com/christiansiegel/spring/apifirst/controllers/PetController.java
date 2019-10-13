package com.christiansiegel.spring.apifirst.controllers;

import com.christiansiegel.spring.apifirst.models.Pet;
import io.swagger.oas.inflector.models.RequestContext;
import io.swagger.oas.inflector.models.ResponseContext;
import org.springframework.stereotype.Component;

@Component
public class PetController {

    public ResponseContext getPetById(RequestContext request, Long petId){
        Pet pet = Pet.builder()
                .petId(petId)
                .name("Demo Pet #" + petId)
                .build();
        return new ResponseContext().status(200).entity(pet);
    }

}
