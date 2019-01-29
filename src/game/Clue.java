package game;

/**
* Represents a single clue in the Hangman game
* It is made of two Strings: the category and the actual phrase
*
* @author Joseph Hodskins
*/
public class Clue {

    /** clue category like person, place, thing, etc. */
    private String category;

    /** phrase for player to guess */
    private String phrase;

    /**
    * Creates a new Clue
    *
    * @param category String for clue category
    * @param phrase String for phrase to guess
    * @throws NullPointerException if category and/or phrase are null
    */
    public Clue(String category, String phrase) {
        if(category == null || phrase == null) {
            throw new NullPointerException();
        }
        
        this.category = category;
        this.phrase = phrase;
    }
    
    /**
    * Returns the category
    *
    * @return category as a String
    */
    public String getCategory() {
        return category;
    }
    
    /**
    * Returns the phrase the player is trying to guess
    *
    * @return phrase as a String
    */
    public String getPhrase() {
        return phrase;
    }
    
    /**
    * Returns a String representation of the Clue
    * Format: category - phrase
    *
    * @return String representation of Clue
    */
    public String toString() {
        return category + "-" + phrase;
    }
    
    
    /**
    * Compares this Clue against another to see if they are equal.
    * They are considered equal if both the categories and phrases are the same.
    *
    * @param obj Object to compare to this Clue
    * @return boolean true if equal
    */
    public boolean equals(Object obj){
        if(obj instanceof Clue) {
            Clue other = (Clue) obj;
            return this.category == other.category && 
                   this.phrase == other.phrase;
        } else {
            return false;
        }
    }
    
    
    /**
    * used to test Class
    *
    * @param args command line arguments
    */
    public static void main(String[] args) {
        Clue c1 = new Clue("Animals", "duckbilled platypus");
        Clue c2 = new Clue("Animals", "polar bear");
        Clue c3 = new Clue("Foods", "chocolate Cake");
        Clue c4 = new Clue("Foods", "chocolate cake");
        Clue c5 = new Clue("Foods", "chocolate cake");
        
        System.out.println("Expected: Animals\nActual: " + c1.getCategory() + "\n");
        System.out.println("Expected: duckbilled platypus\nActual: " + c1.getPhrase() + "\n");
        System.out.println("Expected: Animals-poar bear\nActual: " + c2.toString() + "\n");
        System.out.println("Expected: false\nActual: " + c1.equals(c2) + "\n");
        System.out.println("Expected: false\nActual: " + c2.equals(c3) + "\n");
        System.out.println("Expected: false\nActual: " + c3.equals(c4) + "\n");
        System.out.println("Expected: true\nActual: " + c4.equals(c5));
        
    }
    

}