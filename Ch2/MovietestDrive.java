class Movie {
	String title;
	String genre;
	int rating;

	void playIt() {
		System.out.println("Playing the movie");
	}
}

public class MovietestDrive {
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Gone with the stock";
		one.genre = "Tragic";
		one.rating = -2;

		Movie two = new Movie();
		two.title = "lost in Cubical space";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt();

		Movie three = new Movie();
		three.title = "Byte Club";
		three.genre = "Tragic but ultimately uplifting";
		three.rating = 127;
	}
}