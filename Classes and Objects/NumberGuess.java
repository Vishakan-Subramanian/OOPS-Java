/*
. Write a program called 
NumberGuess
 to play the number guessing game. The program shall 
generate a random number between 0 and 99. The player inputs his/her guess, and the program shall
response with "Try higher", "Try lower" or "You got it in n trials" accordingly. For example:
java NumberGuess
Key in your guess:
50
Try higher
70
Try lower
65
Try lower
61
You got it in 4 trials!
Hints
Use Math.random() to produce a random number in double between 0.0 (inclusive) and 1.0 
(exclusive)
*/

import java.util.Scanner;

public class NumberGuess{
	public static void main(String args[]){
		System.out.println("Guessing Game");
		int gnum = (int)(Math.random() *100);		//generating number from 0-100
		int num=gnum+1;
		int trials=0;
		while(gnum!=num){				//executing till user input is matched
			trials++;
			System.out.println("Enter a number to guess: ");		
			Scanner s=new Scanner(System.in);
			num=s.nextInt();
			if(num>gnum)
				System.out.println("Try lower!");
			else
				System.out.println("Try higher!");
	
		}
		System.out.println("You got it in "+trials+" trials!");
	}
}

/*
Output:

cs1196@u22:~/Desktop/Java$ javac NumberGuess.java
cs1196@u22:~/Desktop/Java$ java NumberGuess
Guessing Game
Enter a number to guess: 
1
Try higher!
Enter a number to guess: 
5
Try higher!
Enter a number to guess: 
23 
Try higher!
Enter a number to guess: 
29
Try higher!
Enter a number to guess: 
59
Try lower!
Enter a number to guess: 
40
Try higher!
Enter a number to guess: 
43
Try higher!
Enter a number to guess: 
49
Try lower!
Enter a number to guess: 
45
Try higher!
Enter a number to guess: 
47
Try lower!
Enter a number to guess: 
46
Try higher!
You got it in 11 trials!

*/
