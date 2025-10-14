package com.example.evenements.service;

import com.example.evenements.domaine.UtilisateurInscritEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class InscriptionService {

    private final ApplicationEventPublisher publisher;

    public InscriptionService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void inscrire(String pseudo) {
        System.out.println("Inscription de " + pseudo);
        publisher.publishEvent(new UtilisateurInscritEvent(pseudo));
    }
}
