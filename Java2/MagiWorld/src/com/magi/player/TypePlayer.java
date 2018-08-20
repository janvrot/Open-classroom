package com.magi.player;

public enum TypePlayer {
    Guerrier("Guerrier"),
    Rodeur("Rodeur"),
    Mage("Mage");

    private String type = "";

    TypePlayer(String type) {
        this.type = type;
    }

}
