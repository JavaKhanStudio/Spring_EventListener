package com.example.evenements.controller;

import com.example.evenements.service.InscriptionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InscriptionController {

    private final InscriptionService inscriptionService;

    public InscriptionController(InscriptionService inscriptionService) {
        this.inscriptionService = inscriptionService;
    }

    @PostMapping
    public boolean addPerson(@RequestParam String name) {
        inscriptionService.inscrire(name);
        return true;
    }





}
