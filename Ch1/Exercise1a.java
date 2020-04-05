class Exercise1a{
	public static void main(String[] args) {
		int x = 1;

		while (x < 10) {

			x = x + 1;  // this will compile and run (no output), but without this line added to this program,
			            // it would run forever in an infinite 'while' loop

			if (x > 3) {
				System.out.println("big x");
			}
		}
	}
}