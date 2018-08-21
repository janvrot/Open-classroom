package com.magi.game;

import com.magi.game.CreatePlayer;
import com.magi.player.Player;
import com.magi.player.TypePlayer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerTest {
    @Test
    public void Given_Value_WhenGettingType_ThenGetBoolean() {
        assertTrue(CreatePlayer.chooseType(1));
        assertTrue(CreatePlayer.chooseType(2));
        assertTrue(CreatePlayer.chooseType(3));
        assertFalse(CreatePlayer.chooseType(4));
    }

    @Test
    public void Given_Value_WhenGettingLvl_ThenGetBoolean() {
        assertFalse(CreatePlayer.chooseLvl(0));
        assertTrue(CreatePlayer.chooseLvl(10));
    }

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