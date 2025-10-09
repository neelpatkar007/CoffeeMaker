import java.util.Scanner;

public class Task3_2 {

	public static void main(String[] args) {
		int rows, i, j;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows in pattern");
		rows = input.nextInt();

		for (i = 1; i <= rows; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

}
