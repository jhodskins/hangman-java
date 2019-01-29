/**
 * 
 */
package game;

import java.util.Random;

/**
 * This is the Hangman game and the model for the GUI.
 * 
 * @author Joseph Hodskins
 *
 */
public class Game {
	
	/** max number of Clues */
    public static final int NUM_CLUES = 125;
    
    /** number of incorrect guesses to lose */
    public static final int MAX_INCORRECT_GUESSES = 6;
    
    /** all possible clues that can be used by the computer to play the game */
    private Clue[] cluePool;
    
    /** index number of the Clue being used in the game */
    private int clueIndex;
    
    /** obscured version of phrase being guessed, what the player sees */
    private String obscuredPhrase;
    
    /** number of incorrect guesses made */
    private int incorrectGuesses;
    
    /** Random object that generates random integers to index into the Clue array */
    private Random randClueIndex;
	/**
	 * This begins the game.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
    * Creates a new game to play by pulling a random
    * Clue from a list.
    *
    */
    public Game() {
    	//TODO 
    }
	    
	    
    /**
    * Constructor for testing the Game class
    *
    * @param seed integer seed to start random number for repeatable testing
    */
    public Game(int seed) {
    	//TODO
    }
	    
    /**
     * Reads the clues.txt file to populate the cluePool array. Each line contains a category
     * and a phrase which is used to create a Clue and then placed in the array.
     */
     private void processFile() {
    	 //TODO
     }
	
     /**
      * Processes lines read in from an input file
      * and returns a Clue object.
      * Line format: category phrase
      *
      * @param line String to process from text file
      * @return Clue object
      */
      private Clue processLine(String line) {
    	  //TODO
    	  return null;
      }
      
      /**
       * Sets up the variables for a new game.
       *
       */
       public void newGame() {
    	   //TODO
       }
       
       /**
        * This gets called any time a new game is started. 
        * Its job is to fill in the initial, obscured phrase. It will take the phrase from 
        * the current Clue and build a new string in which all the letters are replaced by 
        * underscores. Assign the generated string to the instance variable that stores the 
        * obscured version of the phrase.
        */
        private void generateClue() {
        	//TODO
        }
        
        /**
         * This receives a letter guessed by the player and returns true if the phrase contains 
         * the guessed letter and false if it does not. If the phrase does contain the letter, 
         * the obscured phrase is updated, replacing underscores with letters for each 
         * occurrence of letter in the phrase. If the guess is incorrect, the variable that 
         * tracks the number of incorrect guesses is incremented.
         *
         * @param letter char guessed by player
         * @return boolean for if guess is correct
         */
         public boolean isCorrectGuess(char letter) {
        	 //TODO
        	 return false;
         }
         
         /**
          * Tells if player has lost the game. If incorrect guesses is greater than or equal to 6,
          * the game is lost and it returns true. Otherwise it returns false.
          *
          * @return boolean for if game has been lost
          */
          public boolean isGameLost() {
        	  //TODO
        	  return false;
          }
          
          /**
           * This tells if the player has won the game by guessing all of the letters in the phrase.
           * Returns true if game is won and false if not.
           *
           * @return boolean for if game has been won
           */
           public boolean isGameWon() {
        	   //TODO
        	   return false;
           }
           
           /**
            * This returns a version of the obscured phrase that is ready for display in the GUI.
            * It has an extra space in between each character. 
            *
            * @return String of adjusted obscured Phrase
            */
            public String getVisiblePhrase() {
            	//TODO
            	return null;
            }
            
            /**
             * Returns the current Clue's category.
             *
             * @return String of Clue's category
             */
             public String getCurrentCategory() {
            	 //TODO
            	 return null;
             }
             
             /**
              * Returns the current Clue's phrase.
              *
              * @return String of Clue's phrase
              */
              public String getCurrentPhrase() {
            	  //TODO
            	  return null;
              }
}
