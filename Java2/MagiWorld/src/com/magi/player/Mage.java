package com.magi.player;

public class Mage extends Player implements Fight{

    public Mage() {
        this.setTypePlayer(TypePlayer.Mage);
    }

    @Override
    public void basicAttaque(Player playerOne, Player playerTwo) {

    }

    @Override
    public void specialAttaque(Player playerOne, Player playerTwo) {

    }
}
