/**
 * Week 3: Arrays
 */

// here is our class called "Arrays" it is able to be run by other programs and jre
public class Arrays{

	// the main method - the computer looks for this first!
	public static void main(String[] args) {

		players = new String [4];

		players[0] = "Michelle";
		players[1] = "Kevin";
		players[2] = "Marvin";
		players[3] = "Sean";

		//String [] players = {"Michelle", "Kevin", "Marvin", "Sean"}

		int totalPlayers = players.length;

		String theWinner = players[1];
		System.out.println("Congratulations, " + theWinner + "!");


	}

}
