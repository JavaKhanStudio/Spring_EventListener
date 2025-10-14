package com.example.evenements.listeners;

import com.example.evenements.domaine.BienvenueCreeeEvent;
import com.example.evenements.domaine.UtilisateurInscritEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmailBienvenueListener {

    @EventListener
    public BienvenueCreeeEvent genererMessageBienvenue(UtilisateurInscritEvent event) {
        String corps = "Bienvenue " + event.getPseudo() + " !";
        System.out.println("[email] Préparation du message pour " + event.getPseudo());
        return new BienvenueCreeeEvent(event.getPseudo(), corps);
    }
}
