package com.example.evenements.listeners;

import com.example.evenements.domaine.UtilisateurInscritEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class JournalisationListener {

    @EventListener(condition = "#event.pseudo.startsWith('a')")
    public void journaliserSiCommenceParA(UtilisateurInscritEvent event) {
        System.out.println("[log] Priorité au suivi des pseudos en A: " + event.getPseudo());
    }
}
