package numbergame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		int round = 0, score, sum = 0;
		char ch;

		do {
			score = 0;
			int no = ran.nextInt(100) + 1;
			int attempts = 3;
			round++;

			System.out.println("Round " + round + ": Guess the number between 1 and 100!");
			while (attempts > 0) {
				System.out.print("Enter your guess: ");

				if (scan.hasNextInt()) {
					int guess = scan.nextInt();

					if (guess == no) {
						System.out.println("Congratulations! You guessed the correct number.");
						score = attempts; // Points equal remaining attempts
						break;
					} else if (guess > no) {
						attempts--;
						System.out.println("Too high! Try again.");
					} else {
						attempts--;
						System.out.println("Too low! Try again.");
					}
				} else {
					System.out.println("Invalid input. Please enter a number.");
					scan.next(); // Consume invalid input
					attempts--;
				}

				System.out.println("Attempts remaining: " + attempts);

				if (attempts == 0) {
					System.out.println("Sorry, you've run out of attempts. The correct number was " + no + ".");
				}
			}

			sum += score;

			System.out.print("Do you want to play another round? (Y/N): ");
			ch = scan.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');

		System.out.println("Game Over! Your total score is: " + sum);
		scan.close();
	}
}
