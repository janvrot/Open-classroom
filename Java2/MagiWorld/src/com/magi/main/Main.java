package com.magi.main;

import com.magi.game.Fight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean result = true;
        while (result) {
            Fight fight = new Fight();
            Scanner sc = new Scanner(System.in);
            boolean checkParam = false;

            System.out.println("Voulez-vous rejouer ? 1: Oui, 2: Non");

            while (!checkParam) {
                if (sc.hasNextInt()) {
                    int value = sc.nextInt();
                    switch (value) {
                        case 1:
                            result = true;
                            break;
                        case 2:
                            System.out.println("Merci d'avoir joué");
                            result = false;
                            break;
                    }
                    checkParam = true;
                } else {
                    sc.next();
                    System.out.println("Parametre invalide !!");
                }
            }
        }
    }
}
