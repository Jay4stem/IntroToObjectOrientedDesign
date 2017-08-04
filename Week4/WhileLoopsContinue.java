public class WhileLoopsContinue{

	public static void main(String[] args) {

		String [] players = {"David", "Daniel", "Anna", "Gregory"}

		int  totalPlayers = players.length;
		int counter =0;

		while (counter< totalPlayers){
  			counter++;

  			String thePlayer = players[counter];

  			if (thePlayer.equals("David"){
      			continue;
  			}
  			System.out.println("Congratulations, "+ thePlayer+ !");
		}

	}

}
