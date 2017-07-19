public class WhileLoopsBreak{

	public static void main(String[] args) {
		
		String [] players = {"David", "Daniel", "Anna", "Gregory"}

		int  totalPlayers = players.length;
		int counter =0;

		while (counter< totalPlayers){
			if (counter == 3){
				break; // Jump out of the loop
			}
  			String thePlayer = players[counter];
  			System.out.println("Congratulations, "+thePlayer+ "!");
  			counter++;
		}
	}

}