package com.example.evenements.domaine;

public class BienvenueCreeeEvent {
    private final String pseudo;
    private final String message;

    public BienvenueCreeeEvent(String pseudo, String message) {
        this.pseudo = pseudo;
        this.message = message;
    }

    public String getPseudo() { return pseudo; }
    public String getMessage() { return message; }
}
