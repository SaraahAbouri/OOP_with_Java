package classMembersandArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CowsAndBulls {
	public final static int NUM_DIGITS = 4;
	public final static int MAX_VALUE = 9876;
	public final static int MIN_VALUE = 1234;
	public final static int MAX_GUESSES = 10;
	
	private int guessesAdded;
	private int cowCaptured;
	private int bullCaptured;
	private int answer1;
	
	public CowsAndBulls(int seed) {
//		Scanner input = new Scanner(System.in);
//		NumberPicker numberpicker = new NumberPicker(input.nextInt(),1,9);
		NumberPicker randomNumber = new NumberPicker(seed,MIN_VALUE,MAX_VALUE);
		answer1 =randomNumber.nextInt();
		guessesAdded = MAX_GUESSES;
		}
	
	public int guessesRemaining() {
		return guessesAdded;
			
	}
	
	public Result guess(int guessNumber) {
		NumberUtils numberutils = new NumberUtils();
	
		int bulls = numberutils.countMatches(answer1,guessNumber);
		bullCaptured = bulls;
		int cows = numberutils.countIntersect(answer1,guessNumber);
		cowCaptured = cows;
		
		guessesAdded--;
		return new Result(cows,bulls);
	
	}
	
	public int giveUp() {
		return answer1;
		
	}
	
	public boolean gameOver() {
		return guessesAdded == 0 || bullCaptured == 4;
	}
}
