package simongame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Demetrius Greene
 * 
 *         This is the simon game. Colors will randomly flash and the player
 *         will have to press the buttons in that order to win
 *
 */
public class SimonLogic {

	public static void main(String[] args) {
		
		//stores the set of flashes
		ArrayList<Integer> set = new ArrayList<Integer>();
		
		//random object
		Random r = new Random();
		
		//scanner object to get user input for testing
		Scanner keyboard = new Scanner(System.in);
		
		//stores the users guesses 
		ArrayList<String> guesses = new ArrayList<String>();
		
		//boolean for running the game as long as the user puts in correct values
		boolean run = true;
		
	
		int size = set.size(); 
		
		//runs the game as long as the user guesses correctly
		
		while(run) {
			set.add(r.nextInt(4)); 
			for(int i = 0; i < size; i++) {
				
			}
		}
		

	}

}
