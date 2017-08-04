/**
 * Week 3: If Else Conditions
 */


public class WhileLoops{

	public static void main(String[] args) {

		String [] players = {"David", "Daniel", "Anna", "Gregory"}

		int  totalPlayers = players.length;
		int counter=0;

		while (counter< totalPlayers){
  			String thePlayer = players[counter];
  			System.out.println("Congratulations, " + thePlayer + "!");
  			counter++;
		}

}
