package test;
import java.util.Random;
import java.util.Scanner;

public class guessNoGame {
	  public int number;
	    public int inputNumber;
	    public int noOfGuess=0;

	    public int getNoOfGuess() {
	        return noOfGuess;
	    }

	    public void setNoOfGuess(int noOfGuess) {
	        this.noOfGuess = noOfGuess;
	    }

	    guessNoGame() {
	        Random rand = new Random();
	        this.number = rand.nextInt(100);

	    }

	    void takeUserinput() {
	        System.out.println(" guess the number  ");
	        Scanner sc = new Scanner(System.in);
	        inputNumber = sc.nextInt();
	        //return inputNumber;

	    }

	    boolean iscorerct() {
	        noOfGuess++;
	        if (inputNumber == number) {
	            System.out.format(" yes you gussed it right, it was %d\n you guess it in %d attempts ",number,noOfGuess);
	           // System.out.println("yes you gussed it right, it was %d you guess it in %d attempts",number,noOfGuess);
	            return true;
	        }
	        else if(inputNumber<number){
	            System.out.println(" too low...");
	        }
	        else if(inputNumber>number){
	            System.out.println(" too high...");
	        }
	return false;
	    }


	    public static void main(String[] args) {
//	         game g= new game();
	    	guessNoGame g= new guessNoGame();
	           boolean b=false;
	           while(!b) {
	               g.takeUserinput();

	             b = g.iscorerct();
	               System.out.println(b);
	           }
	    }

}
