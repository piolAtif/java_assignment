import java.util.Scanner;

public class Create_matrix{
	int matrix[][];
	int row, column;

	void create(){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of rows:");
		row = Integer.parseInt(scan.nextLine());

		System.out.println("Enter number of columns");
		column = Integer.parseInt(scan.nextLine());

		matrix = new int[row][column];	
		System.out.println("Enter data");

		for (int i = 0; i<row; i++) {
			for (int j = 0; j<column ;j++) {
				matrix[i][j] = scan.nextInt();	
			}
		}
	}

	void display(){
		System.out.println("Matrix is:");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j< column; j++) {
				System.out.print("\t"+matrix[i][j]);
			}
			System.out.println();
		}
	}
}