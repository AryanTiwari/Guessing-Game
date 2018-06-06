import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RandomNumber {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// Make random number
		int number = (int) (Math.random() * 100);
		ArrayList<Integer> numbersGuessed = new ArrayList<Integer>();

		// Guess the number
		System.out.println("Guess a number from 0 - 100");

		// Guess loop
		for (int guesses = 10; guesses > 0; guesses--) {

			// Guess stuff
			int guess = input.nextInt();
			numbersGuessed.add(guess);

			if (guesses == 1) {
				System.out.println("You ran out of guesses");
				System.out.println("The number was " + number);
				return;
			}
			if (guess == number && guesses == 0) {
				JOptionPane.showMessageDialog(null, "Wow you got it first try!", "Correct", JOptionPane.PLAIN_MESSAGE);
			} else if (guess < 0 || guess > 100) {
				System.out.println("Your guess should be from 0 - 100\n");
				guesses = guesses - 1;
			} else if (guess == number) {
				JOptionPane.showMessageDialog(null, "Good job! You guessed the number!");
			} else if (guess < number) {
				System.out.println("Too low, try again");
				System.out.println("You have " + (guesses - 1) + " guesses left");
				System.out.println("You have previously guessed: " + numbersGuessed + "\n");
			} else if (guess > number) {
				System.out.println("Too high, try again");
				System.out.println("You have " + (guesses - 1) + " guesses left");
				System.out.println("You have previously guessed: " + numbersGuessed + "\n");
			}
		}

	}
}