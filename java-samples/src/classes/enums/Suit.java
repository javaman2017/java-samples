package classes.enums;

public enum Suit {
    CLUBS("CLUBS"),  
    DIAMONDS("DIAMONDS"), 
    HEARTS("HEARTS"), 
    SPADES("SPADES"),
    ;
    
    String name;
    Suit(String name){ this.name = name; }
    
    public String toString(){ return this.name; }
}