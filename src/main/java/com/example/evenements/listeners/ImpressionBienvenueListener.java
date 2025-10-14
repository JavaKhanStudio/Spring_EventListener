package com.example.evenements.listeners;

import com.example.evenements.domaine.BienvenueCreeeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ImpressionBienvenueListener {

    @EventListener
    public void imprimer(BienvenueCreeeEvent event) {
        System.out.println("[email] Envoi → " + event.getMessage());
    }
}
