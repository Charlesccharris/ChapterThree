import java.util.Scanner;

class HomeWork3_17{
	public static void main(String[] args){
	/*(Game: scissor, rock, paper)
	Write a program that plays the popular scissor-rockpaper game.
	(A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.)
	The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
	The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws.
	Here are sample runs: scissor (0), rock (1), paper (2):
	1 The computer is scissor. You are rock. You won scissor (0), rock (1), paper (2): 2 The computer is paper. You are paper too. It is a draw
	*/
	Scanner input = new Scanner(System.in);

	int currentRound = 1;
	int tied = 0;
	int won = 0;
	int lost = 0;
	char S = '0';
	char R = '1';
	char P = '2';

	System.out.print("How many rounds: ");
	int rounds = input.nextInt();

	while(currentRound <= rounds){
	System.out.println("Round " + currentRound);
	int number1 = (int)(Math.random() * 10);
	int computerHand = number1 % 3;
	System.out.print("(R)ock, (P)aper, or (S)cissors: ");

	//This is what I used for letter inputs
	char guess = input.next().charAt(0);

		if(guess != 'R' && guess != 'P' && guess !='S'){
		System.out.println("Really, " + guess + "? You had one job.");
		currentRound = rounds;
		System.exit(1);
		}
		if(computerHand == 0){
		System.out.print("Computer tossed scissors, ");
			if(guess == 'S'){
			System.out.println("so you tied");
			tied ++;
			}
			if(guess == 'R'){
			System.out.println("so you won");
			won ++;
			}
			if(guess == 'P'){
			System.out.println("so you lost");
			lost ++;
			}
		currentRound ++;
		}
		else if(computerHand == 1){
		System.out.print("Computer tossed rock, ");
			if(guess == 'S'){
			System.out.println("so you lost");
                        lost ++;
			}
			if(guess == 'R'){
			System.out.println("so you tied");
                        tied ++;
			}
			if(guess == 'P'){
			System.out.println("so you won");
                        won ++;
			}
		currentRound ++;
		}
		else if(computerHand == 2){
		System.out.print("Computer tossed paper, ");
			if(guess == 'S'){
			System.out.println("so you won");
                        won ++;
			}
			if(guess == 'R'){
			System.out.println("so you lost");
                        lost ++;
			}
			if(guess == 'P'){
			System.out.println("so you tied");
                        tied ++;
			}
		currentRound ++;;
		}
	System.out.println("Current scores: " + won + " wins " + tied + " ties and " + lost + " losses\n");
	}
	}
}
