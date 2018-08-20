package com.magi.player;

import java.util.Scanner;

public class Player {

    private TypePlayer typePlayer;
    private int lvl = 0;
    private int life = 0;
    private int strength = 0;
    private int agility = 0;
    private int intelligence = 0;

    public Player() {

    }


    public int getLvl() {
        return lvl;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public TypePlayer getTypePlayer() {
        return typePlayer;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setTypePlayer(TypePlayer typePlayer) {
        this.typePlayer = typePlayer;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String toString() {
        String str = "Je suis le " + this.getTypePlayer();
        str += " niveau " + this.getLvl();
        str += " je possède " + this.getLife() + " en vitalité, ";
        str += this.getStrength() + " en force, ";
        str += this.getAgility() + " en agilité, ";
        str += this.getIntelligence() + " en intelligence !";
        return str;
    }


}
