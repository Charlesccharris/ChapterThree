import java.util.Scanner;

class HomeWork3_14 {
	public static void main(String[] args) {
	/*(Game: heads or tails)
	Write a program that lets the user guess whether the flip of a coin results in heads or tails.
	The program randomly generates an integer 0 or 1, which represents head or tail.
	The program prompts the user to enter a guess and reports whether the guess is correct or incorrect.
	*/
	Scanner input = new Scanner(System.in);
	int currentRound = 1;
	char H = '0';
	char T = '1';

	System.out.print("Number of rounds: ");
	int totalRounds = input.nextInt();


	while(currentRound <= totalRounds){

	  System.out.print("(H)eads or (T)ails: ");
	  char guess = input.next().charAt(0);
	  int number1 = (int)(Math.random() * 10);
	  int answer = number1 % 2;

	  if(guess == 'H' && answer == 0)
	  System.out.println("It was heads, so you guessed right!");
	  if(guess == 'T' && answer == 1)
	  System.out.println("It was tails, so you guessed right!");
	  if(guess == 'H' && answer == 1)
	  System.out.println("It was tails, so you guessed wrong!");
	  if(guess == 'T' && answer == 0)
	  System.out.println("It was heads, so you guessed wrong!");
	  if(guess != 'T' && guess != 'H'){
	  System.out.println("You had TWO options!");
	  System.exit(1);
	  }
	  currentRound++;
	}

	}
}
