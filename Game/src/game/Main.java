/**
 * 
 */
package game;

import java.util.Scanner;

/**
 * @author Justin Wang A game of RPS25, which is like Rock Paper Scissors but
 *         with 25 different options.
 */
public class Main {

	private static Choice player1Choice;
	private static Choice player2Choice;
	private static int winner;

	public static void main(String[] args) {
		// TODO turn this bad pseudocode into good actual code
		/**
		 * If args:
-			Take args as player choice (rps25 <name> <option>) and run game against AI
-			If no args:
-			Show Main Menu: Play, Help, Detail <arg>
-			Play:
-				Prompt the player to enter their name
-				Prompt if the player wants to play against the computer or a friend
-				If computer, generate computer choice
-				If friend, blank the whole screen, ask friend for name and choice
-				battle() and compare results
-				Print the winner and how they won
-				Keep a running tally of wins
-				Ask if the user wants to play again
-				If so, loop
-				If not, exit to main menu
-			Help:
-				Print a statement about how to play the game
-				Exit to main menu
-			Detail <arg>:
-				If arg:
-				Give details about that choice
-				Exit to main menu
-				If no arg:
-				Print all the choices
-				Prompt for one of the choices
-				Gives details on how that choice
-				Exit to main menu
		 */

		// TODO make asking for help a thing
		Scanner user_input = new Scanner(System.in);

		while (true) {
			System.out.println("Enter choice 1.");
			try {
				// See if that was a valid choice
				player1Choice = Choice.valueOf(user_input.next().toUpperCase());
				break;
			} catch (IllegalArgumentException e) {
				// Try again!
				System.out.println("That wasn't a valid choice; try again. You can enter H for help.");
			}
		}
		
		//Dirty, dirty way of clearing the screen
		for (int i=0; i<1000; i++){
			System.out.println("");
		}
		
		while (true) {
			System.out.println("Enter choice 2.");
			try {
				// See if that was a valid choice
				player2Choice = Choice.valueOf(user_input.next().toUpperCase());
				break;
			} catch (IllegalArgumentException e) {
				// Try again!
				System.out.println("That wasn't a valid choice; try again. You can enter H for help.");
			}
		}
		
		user_input.close();

		winner = battle(player1Choice, player2Choice);
		//TODO make this more flashy, print how the player won
		if (winner == 0) {
			System.out.println("The battle is a tie!");
		} else if (winner == 1) {
			System.out.println("The winner is player 1 with " + player1Choice + "!");
		} else {
			System.out.println("The winner is player 2 with " + player2Choice + "!");
		}

		System.exit(0);
	}

	/**
	 * Compares the two player choices and returns, as an integer, which player
	 * won. In the event of a tie, 0 is returned.
	 * 
	 * @param player1Choice
	 *            the first player's choice
	 * @param player2Choice
	 *            the second player or computer's choice
	 * @return 1 or 2 if a player wins, 0 on tie
	 */
	private static int battle(Choice player1Choice, Choice player2Choice) {
		// TODO be smarter about this algorithm
		Choice higherChoice, lowerChoice;
		int higherPlayer, lowerPlayer;
		int diff;

		diff = player1Choice.id() - player2Choice.id();

		// Check for ties and whose value is higher
		if (diff == 0) {
			return 0;
		} else if (diff > 0) {
			higherChoice = player1Choice;
			lowerChoice = player2Choice;
			higherPlayer = 1;
			lowerPlayer = 2;
		} else {
			higherChoice = player2Choice;
			lowerChoice = player1Choice;
			higherPlayer = 2;
			lowerPlayer = 1;
		}

		// If there was no tie, battle
		if (higherChoice.id() - lowerChoice.id() <= 12) {
			return higherPlayer;
		} else {
			return lowerPlayer;
		}

	}

	/**
	 * If a computer opponent is chosen, this method picks the second player's
	 * choice.
	 * 
	 * @return a valid RPS25 option
	 */
	private Choice computerOpponent(/* personality parameter? */) {
		// TODO Randomly pick one of the 25 choices (or create personalities
		// that have a bias to certain choices)
		return Choice.ROCK; // HOW PREDICTABLE
	}

}
