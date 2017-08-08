/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmonopoly.gamedata.decks.cards;

/**
 * Defines an abstract class consistent across all Cards utilised in the game.
 * Allows each deck to refer to all the different types of cards via a single
 * "Type", whilst parsing the actions via the specific instantiation type.
 * @author Sam P. Morrissey
 */
public abstract class Card {
    private final String description;
    
    /**
     * Defines the generic constructor utilised by all Card classes.
     * @param description The card description.
     */
    public Card(String description) {
        this.description = description;
    }
    
    /**
     * Accesses the description of the Card.
     * @return The card description.
     */
    public String getDescription() {
        return description;
    }
}