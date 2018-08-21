package com.magi.game;

import com.magi.game.CreatePlayer;
import com.magi.player.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test des combats de la class Fight
 *
 * @see Fight
 * @author Antoine JANVROT
 */
public class FightTest {

    /**
     * Instanciation d'un joueur
     * @see Player
     */

    private static Player playerOne;
    /**
     * Instanciation d'un joueur
     * @see Player
     */

    private static Player playerTwo;
    /**
     * Instanciation d'un joueur
     * @see Player
     */
    private static Player playerThree;

    /**
     * Creation de 3 joueurs
     */
    @BeforeAll
    public static void initPlayers() {
        CreatePlayer.chooseType(1);
        CreatePlayer.chooseLvl(10);
        CreatePlayer.addStat("addStrength", 10);
        CreatePlayer.addStat("addAgi", 0);
        CreatePlayer.addStat("addIntel", 0);
        playerOne = CreatePlayer.getPlayer();
        CreatePlayer.chooseType(2);
        CreatePlayer.chooseLvl(10);
        CreatePlayer.addStat("addStrength", 0);
        CreatePlayer.addStat("addAgi", 10);
        CreatePlayer.addStat("addIntel", 0);
        playerTwo = CreatePlayer.getPlayer();
        CreatePlayer.chooseType(3);
        CreatePlayer.chooseLvl(10);
        CreatePlayer.addStat("addStrength", 0);
        CreatePlayer.addStat("addAgi", 0);
        CreatePlayer.addStat("addIntel", 10);
        playerThree = CreatePlayer.getPlayer();
    }

    /**
     * test des attaques du guerrier
     */
    @Test
    public void Result_Attacks_Guerrier() {
        playerOne.basicAttaque(playerOne, playerTwo);
        assertEquals(40, playerTwo.getLife());
        playerOne.specialAttaque(playerOne, playerTwo);
        assertEquals(35, playerOne.getLife());
        assertEquals(20, playerTwo.getLife());
    }

    /**
     * test des attaques du rodeur
     */
    @Test
    public void Result_Attacks_Rodeur() {
        playerTwo.basicAttaque(playerTwo, playerThree);
        assertEquals(40, playerThree.getLife());
        playerTwo.specialAttaque(playerTwo, playerThree);
        assertEquals(15, playerTwo.getAgility());
    }

    /**
     * test des attaques du mage
     */
    @Test
    public void Result_Attacks_Magicien() {
        playerThree.basicAttaque(playerThree, playerOne);
        assertEquals(40, playerOne.getLife());
        playerThree.specialAttaque(playerThree, playerTwo);
        assertEquals(50, playerThree.getLife());
    }
}
