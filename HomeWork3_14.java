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
	int wins = 0;
	int losses = 0;
	char H = '0';
	char T = '1';
	char L = '2';

	System.out.print("Type (1) for coin flip, or (2) for Higher or lower");
		int game = input.nextInt();
	switch(game){
		case 1:
			System.out.print("Number of rounds: ");
			int totalRounds = input.nextInt();

			while(currentRound <= totalRounds){

			  System.out.print("(H)eads or (T)ails: ");
			  char guess = input.next().charAt(0);
			  int number1 = (int)(Math.random() * 10);
			  int answer = number1 % 2;

			  if(guess == 'H' && answer == 0){
			  System.out.println("It was heads, so you guessed right!");
			  wins++;
			  }
			  if(guess == 'T' && answer == 1){
			  System.out.println("It was tails, so you guessed right!");
			  wins++;
			  }
			  if(guess == 'H' && answer == 1){
			  System.out.println("It was tails, so you guessed wrong!");
			  losses++;
			  }
			  if(guess == 'T' && answer == 0){
			  System.out.println("It was heads, so you guessed wrong!");
			  losses++;
			  }
			  if(guess != 'T' && guess != 'H'){
			  System.out.println("You had TWO options!");
			  System.exit(1);
			  }
			  currentRound++;
			}
		case 2:
			while(losses < 1){
				int newNumber = (int)(Math.random() * 100 % 14);
				System.out.print("The current number is " + newNumber + 
						 "is the next number going to be higher or lower: ")
				int guessTwo = input.next().charAt(0);
				int oldNumber = newNumber;
				int newNumber = (int)(Math.random() * 100 % 14);
				if(oldNumber < newNumber && guessTwo == 'H')
					System.out.println("The new number was higher, so you guessed correct.");
				if(oldNumber > newNumber && guessTwo == 'H'){
					System.out.println("The new number was lower, so you guessed wrong.");
					losses++;
				}
				if(oldNumber < newNumber && guessTwo == 'L'){
					System.out.println("The new number was higher, so you guessed wrong.");
					lossess++;	
				}
				if(oldNumber > newNumber && guessTwo == 'L')
					System.out.println("The new number was higher, so you guessed correct.");
			}
	}
	System.out.print("\nYou won " + wins + " times, and lost " + losses + " times. ");
	if(wins > losses)
	System.out.println("You got lucky.");
	if(losses > wins)
	System.out.println("Guess today's just not your lucky day.");
	if(losses == wins)
	System.out.println("");
	}
}
