import java.util.Random;
import java.util.Scanner;

public class GameLogic {

public void RandomWordGenerator(){

    // Array of words
    String randomWords[] = new String[]{"claps", "crabs", "creep", "crawl"};
    Random random = new Random();

    String guessedWord[] = {randomWords[random.nextInt(randomWords.length)]};

    //Scanner to take users guess input
    Scanner guesses = new Scanner(System.in);
    String guess = guesses.nextLine();
    
    // use the replace function in this string string to hide the functions in the string
    System.out.println("Guess a letter: _ _ _ _ _");

    /* Put a do/while loop around this statement to loop this sequence 5 times so you can
    have a message when the user runs out of lives saying sorry youre done 

    How would you do this so that it iteratively prints the letters rather than one at a time

    //How can you just unhide a letter rather than hardcoding it?
*/ 
     
    
        if(guess.equals(guessedWord[0])){
            
            
        }
        else if(guess.equals(guessedWord[1])){

        }
        else if(guess.equals(guessedWord[2])){
        
        }

        else if(guess.equals(guessedWord[3])){

        }
        else if(guess.equals(guessedWord[4])){

        }
        else{
            System.out.println("WRONG TRY AGAIN :)");
            // call a function that links to a loop statement that
            //calls the count down function which you can add to the string above repeats 
            //so you can have soemthing like "Wrong try again 4 lives remaining"
        }

        Scanner.close();
    }

} 


 

