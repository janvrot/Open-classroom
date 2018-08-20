package com.magi.player;

public class Player {

    private TypePlayer typePlayer;
    private int lvl;
    private int life;
    private int strength;
    private int agility;
    private int intelligence;

    public Player() {
    }

    public Player(TypePlayer typePlayer, int lvl, int strength, int agility, int intelligence) {
        this.typePlayer = typePlayer;
        this.lvl = lvl;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
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

    public void setTypePlayer(TypePlayer typePlayer) {
        this.typePlayer = typePlayer;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
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
