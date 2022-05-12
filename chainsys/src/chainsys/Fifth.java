package chainsys;

public class Fifth {

	private static final char[] countB = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTriangle();
		// printNumbertoten();

		/*
		 * int x = 1; System.out.println(x); System.out.println(++x);
		 * System.out.println(--x); }
		 */
	}

	public static void printNumbertoten() {
		int count = 0;
		for (count = 0; count <= 10; count++) {
			System.out.println(count + " ");
		}
	}

	public static void printNumbertentoone() {
		int count = 0;
		for (count = 10; count >= 0; count--) {
			System.out.println(count + "  ");
		}
	}

//nested loop
	public static void printTriangle() {
	
		for (int countA = 1; countA <= 5; countA++) {
			for (int countB = 1; countB <= countA; countB++) {
				System.out.print(countB);
			}
			System.out.println();
		}
		for (int countA = 5 ; countA >= 1; countA--) {
			for (int countB = 1; countB <= countA; countB++) {
				
					System.out.print(countB);
				}
				System.out.println();
			}

		for (int countA =5; countA >=1; countA--) {
			for (int countB = 1; countB <= countA; countB++) {
				System.out.print(countB);
			}
			System.out.println();
}
}
}
