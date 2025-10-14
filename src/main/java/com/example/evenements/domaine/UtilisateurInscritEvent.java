package com.example.evenements.domaine;

import java.time.Instant;

public class UtilisateurInscritEvent {
    private final String pseudo;
    private final Instant quand;

    public UtilisateurInscritEvent(String pseudo) {
        this.pseudo = pseudo;
        this.quand = Instant.now();
    }

    public String getPseudo() { return pseudo; }
    public Instant getQuand() { return quand; }
}
