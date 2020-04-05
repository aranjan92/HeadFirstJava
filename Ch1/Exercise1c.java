class Exercise1c {
	
	public static void main(String[] args) { // the 'while' loop code must be inside a method. 
											 //	It can't just be hanging out inside the class.
		int x = 5;

		while (x > 1) {
			x = x - 1;

			if (x < 3) {
				System.out.println("small x");
			}
		}
	}
}