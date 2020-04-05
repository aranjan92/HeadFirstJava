public class GuessGame {  //Guessgame has three instance variables for the three player object
	Player p1;
	Player p2;
	Player p3;

	public void startGame() { 
		p1 = new Player();  // Create three Player objects and assign them to the three Player instance variables
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0;  // declare three variables to hold the three guesses the Player make
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1isRight = false; // declare three variables to hold a true or false based on the player's answer
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random() * 10); // make a 'target' number that the player have to guess
		System.out.println("I'm thinking of a number between 0 and 9..."); 

		while(true) {
			System.out.println("Number to guess is " + targetNumber);

			p1.guess(); //call each person guess() method
			p2.guess();
			p3.guess();

			
		}
	}
}