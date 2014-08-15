/**
 * 
 */
package game;

import java.util.ArrayList;

/**
 * @author Justin Wang
 * A game of RPS25, which is like Rock Paper Scissors but with 25 different options.
 */
public class Main {
	
	private String player1Choice;
	private String player2Choice;

	public static void main(String[] args) {
		//TODO turn this bad pseudocode into good actual code
		/**
			If args:
			Take args as player choice (rps25 <name> <option>) and run game against AI
			If no args:
			Show Main Menu: Play, Help, Detail <arg>
			Play:
				Prompt the player to enter their name
				Prompt if the player wants to play against the computer or a friend
				If computer, generate computer choice
				If friend, blank the whole screen, ask friend for name and choice
				battle() and compare results
				Print the winner and how they won
				Keep a running tally of wins
				Ask if the user wants to play again
				If so, loop
				If not, exit to main menu
			Help:
				Print a statement about how to play the game
				Exit to main menu
			Detail <arg>:
				If arg:
				Give details about that choice
				Exit to main menu
				If no arg:
				Print all the choices
				Prompt for one of the choices
				Gives details on how that choice
				Exit to main menu
		 */
	}
	
	/**
	 * Compares the two player choices and returns, as an integer, which player won. In the event of a tie, 0 is returned.
	 * 
	 * @param player1Choice the first player's choice
	 * @param player2Choice the second player or computer's choice
	 * @return 1 or 2 if a player wins, 0 on tie
	 */
	private int battle(String player1Choice, String player2Choice){
		//TODO make this do real things
		return 0;
	}
	
	/**
	 * If a computer opponent is chosen, this method picks the second player's choice.
	 * @return a valid RPS25 option
	 */
	private String computerOpponent(/*personality parameter?*/){
		//TODO Randomly pick one of the 25 choices (or create personalities that have a bias to certain choices)
		return "Nothing because I am not a real person";
	}

}
