package com.example.evenements.listeners;

import com.example.evenements.domaine.UtilisateurInscritEvent;
import com.example.evenements.domaine.BienvenueCreeeEvent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class StatistiquesListener {

    @Value("${app.stats.pause-ms:500}")
    private long pauseMs;

    @Async
    @EventListener
    public void incrementerStatsInscription(UtilisateurInscritEvent event) {
        dormir();
        System.out.println("[stats] +1 inscription pour " + event.getPseudo());
    }

    @Async
    @EventListener
    public void tracerCreationBienvenue(BienvenueCreeeEvent event) {
        dormir();
        System.out.println("[stats] message de bienvenue généré pour " + event.getPseudo());
    }

    private void dormir() {
        try { Thread.sleep(pauseMs); } catch (InterruptedException ignored) { Thread.currentThread().interrupt(); }
    }
}
