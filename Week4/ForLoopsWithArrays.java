public class ForLoopsWithArrays{

	public static void main(String[] args) {

		String [] players = {"David", "Daniel", "Anna", "Gregory"}

		int  totalPlayers = players.length;
		int counter;

		for (counter=0; counter < totalPlayers; counter++){
 			String thePlayer = players[counter];
 			System.out.println("Congratulations,"+thePlayer+"!");
 		}

 	// 	for (String pl: players){
 	// 		System.out.println("Congratulations," + pl +"!");
		// }


	}

}
