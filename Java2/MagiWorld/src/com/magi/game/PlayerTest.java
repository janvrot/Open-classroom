package com.magi.game;

import com.magi.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * test de la creation d'un joueur
 * @see Player
 */
public class PlayerTest {

    /**
     * test de l'ajout de type au joueur
     */
    @Test
    public void Given_Value_WhenGettingType_ThenGetBoolean() {
        assertTrue(CreatePlayer.chooseType(1));
        assertTrue(CreatePlayer.chooseType(2));
        assertTrue(CreatePlayer.chooseType(3));
        assertFalse(CreatePlayer.chooseType(4));
    }

    /**
     * test de l'ajout de nieau au joueur
     */
    @Test
    public void Given_Value_WhenGettingLvl_ThenGetBoolean() {
        assertFalse(CreatePlayer.chooseLvl(0));
        assertTrue(CreatePlayer.chooseLvl(10));
    }

    /**
     * test de l'ajout de statistique au joueur
     */
    @Test
    public void Given_Value_WhenGettingStat_ThenGetBoolean() {
        CreatePlayer.chooseType(1);
        Player player = CreatePlayer.getPlayer();
        CreatePlayer.chooseLvl(15);
        CreatePlayer.addStat("addStrength", 5);
        CreatePlayer.addStat("addAgi", 5);
        CreatePlayer.addStat("addIntel", 5);
        assertEquals(5, player.getStrength());
        assertEquals(5, player.getAgility());
        assertEquals(5, player.getIntelligence());
        assertEquals(0, CreatePlayer.getStatRestant());
    }
}