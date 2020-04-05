class Exercise1b{  // this file won't compile without a class declaration, and don't forget the matching curly brace!
	
	public static void main(String[] args) {
		int x = 5;
		while (x > 1) {
			x = x - 1;

			if (x < 3) {
				System.out.println("small x");
			}
		}
	}
}