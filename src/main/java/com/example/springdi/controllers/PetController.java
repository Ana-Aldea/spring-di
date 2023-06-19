package com.example.springdi.controllers;

import com.example.springdi.services.PetService;

/**
 * Created by jt on 12/28/19.
 */
public class PetController {

    private final PetService petService;

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
