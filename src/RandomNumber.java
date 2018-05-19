import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RandomNumber {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// Make random number
		Random number = new Random();
		int number1 = number.nextInt(100) + 0;

		// Guess the number
		System.out.println(number1);
		System.out.println("Guess a number from 0 - 100");

		// Guess loop
		for (int guesses = 0; guesses < 10; guesses++) {

			// Guess stuff
			int guess = input.nextInt();

			if (guess == number1 && guesses == 0) {
				JOptionPane.showMessageDialog(null, "Wow you got it first try!");
			} else if (guess < 0 || guess > 100) {
				System.out.println("Your guess should be from 0 - 100\n");
				guesses = guesses - 1;
			} else if (guess == number1) {
				JOptionPane.showMessageDialog(null, "Good job! You guessed the number!");
				break;
			} else if (guess < number1) {
				System.out.println("Too low, try again");
				System.out.println("You have " + (9 - guesses) + " guesses left\n");
			} else if (guess > number1) {
				System.out.println("Too high, try again");
				System.out.println("You have " + (9 - guesses) + " guesses left\n");
			} else if (guess == 0) {
				System.out.println("You couldn't guess the number");
			}
		}
	}
}
