import java.util.Random;
import java.util.Scanner;

public class GameLogic {

public void RandomWordGenerator(){

    // Array of words
    String randomWords[] = new String[]{"claps", "crabs", "creep", "crawl"};
    Random random = new Random();

    //Removed unneccessary Array because you can just use .contains . replace etc etc
    String wordToGuess = randomWords[random.nextInt(randomWords.length)];
    
    Scanner guesses = new Scanner(System.in);
    
    
    
    //initialised j rather than using a for loop in the else statement within the if statements inside the do while loop below
    int j = 5;

    do{
    
        //moved question and scanner inside do-while loop so that it workspast the first ask for a letter 
        System.out.println("Guess a letter: " + wordToGuess.replaceAll("[a-z]", " _ "));
        String guess = guesses.nextLine();

        if(wordToGuess.contains(guess)){

            System.out.println(guess.replaceFirst(guess, "_"));
            wordToGuess = guess.replace(wordToGuess, guess);
        
          }
        else if (wordToGuess.equals(guess)) {

            System.out.println("Well done the answer is:" + guess);

        }
        
        else{
        
    
                 if (j >= 1 ) {
                    
                        System.out.println("WRONG TRY AGAIN :) you have" + j + "lives remaining");
                  
                     }
                         else{

                            System.out.println("Youre done, You're done");
                            System.exit(0);
                      }
                   }   j--;
               
           
        
        }while(j>0);

        guesses.close();

    }
}


 

