/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmonopoly.gamedata.decks.cards;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sam P. Morrissey
 */
public class PayableCardTest {
    
    PayableCard pay = new PayableCard("Testing", -200, false);

    @Test
    public void testValue() {
        assertEquals(-200, pay.getValue());
    }
    
    @Test
    public void testDescription() {
        assertEquals("Testing", pay.getDescription());
    }
    
    @Test
    public void testGetPerPlayer() {
        assertEquals(false, pay.getPerPlayer());
    }
    
    
}
