public class Arrays{

	public static void main(String[] args) {
		
		players = new String [4];

		players[0] = "David";
		players[1] = "Daniel";
		players[2] = "Anna";
		players[3] = "Gregory";

		//String [] players = {"David", "Daniel", "Anna", "Gregory"}

		int totalPlayers = players.length;

		String theWinner = players[1];
		System.out.println("Congratulations, " + theWinner + "!");


	}

}