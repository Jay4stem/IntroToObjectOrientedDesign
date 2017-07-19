public class DoWhile{

	public static void main(String[] args) {
		
		String [] players = {"David", "Daniel", "Anna", "Gregory"}

		int  totalPlayers = players.length;
		int counter =0;

		do {
   			System.out.println("Congratulations, "+ players[counter] + "!");
   			counter++;
   		} while (counter< totalPlayers);

	}

}