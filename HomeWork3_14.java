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

	System.out.print("Type (1) for coin flip, or (2) for Higher or lower: ");
		int game = input.nextInt();
	switch(game){
		case 1:
			System.out.print("Number of coin flips: ");
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
			System.out.print("\nYou won " + wins + " times, and lost " + losses + " times. ");
			if(wins > losses)
			System.out.println("You got lucky.");
			if(losses > wins)
			System.out.println("Guess today's just not your lucky day.");
			if(losses == wins)
			System.out.println("");
			break;
		case 2:
			int newNumber = (int)(Math.random() * 100 % 13);
			System.out.println("Numbers 0 - 13, how many can you get right?");
			while(losses < 1){
				System.out.print("The current number is " + newNumber + 
						 " is the next number going to be (H)igher or (L)ower: ");
				int guessTwo = input.next().charAt(0);
				int oldNumber = newNumber;
				newNumber = (int)(Math.random() * 100 % 14);
				if(guessTwo != 'H' && guessTwo != 'L')
					System.exit(1);
				if(oldNumber < newNumber && guessTwo == 'H'){
					System.out.println("The new number was "+ newNumber + " which was higher, so you guessed correct.\n");
					wins++;
				}
				if(oldNumber > newNumber && guessTwo == 'H'){
					System.out.println("The new number was " + newNumber + " which was lower, so you guessed wrong.\n");
					losses++;
				}
				if(oldNumber < newNumber && guessTwo == 'L'){
					System.out.println("The new number was " + newNumber + " which was higher, so you guessed wrong.\n");
					losses++;
				}
				if(oldNumber > newNumber && guessTwo == 'L'){
					System.out.println("The new number was " + newNumber + " which was lower, so you guessed correct.\n");
					wins++;
				}
				if(oldNumber == newNumber)
					System.out.println("It was the same number.\n");
			}
			System.out.println("\nYou got " + wins + " rounds in a row");
			break;
		}
	}
}
