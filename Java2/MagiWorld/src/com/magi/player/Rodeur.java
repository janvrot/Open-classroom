package com.magi.player;

public class Rodeur extends Player implements Fight {

    public Rodeur() {
        this.setTypePlayer(TypePlayer.Rodeur);
    }

    @Override
    public void basicAttaque(Player playerOne, Player playerTwo) {

    }

    @Override
    public void specialAttaque(Player playerOne, Player playerTwo) {

    }
}