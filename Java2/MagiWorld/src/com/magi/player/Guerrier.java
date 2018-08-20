package com.magi.player;

public class Guerrier extends Player implements Fight {

    public Guerrier() {
        this.setTypePlayer(TypePlayer.Guerrier);
    }


    @Override
    public void basicAttaque(Player playerOne, Player playerTwo) {

    }

    @Override
    public void specialAttaque(Player playerOne, Player playerTwo) {

    }
}
