import java.util.Scanner;
public class DiagonalSumIn2DMatrix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter no.of rows : ");
		int rows = sc.nextInt();

		System.out.print("\nEnter no.of columns : ");
		int columns = sc.nextInt();

		if(rows <= 0 || columns <= 0){
			System.out.println("\nRows & Columns must be greater than zero !!");
			sc.close();
			return;
		}

		int a[][] = new int[rows][columns];

		System.out.println("\nEnter the elements : ");
		takeInput(a,sc);

		int diagonal_sum = printMatrixAndDiagonalOfMatrixAndReturnDiagonalSum(a);

		System.out.println("\nDiagonal Sum : "+diagonal_sum);

		sc.close();
	}
	public static void takeInput(int a[][],Scanner sc){

		for (int i = 0; i < a.length ; ++i) {
			
			for (int j = 0 ; j < a[i].length;++j) {
				
				a[i][j] = sc.nextInt();
			}
		}
	}
	public static int printMatrixAndDiagonalOfMatrixAndReturnDiagonalSum(int a[][]){

		System.out.println("\n:: Resulted Matrix ::");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	   for (int i = 0; i < a.length ; ++i) {
			
			for (int j = 0 ; j < a[i].length;++j) {
				
				 System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}

		int diagonal_sum = 0;

		System.out.println("::Diagonal Of Matrix::");		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");

		for (int i = 0; i < a.length ; ++i) {
			
			for (int j = 0 ; j < a[i].length;++j) {
				if (i == j) {

					System.out.print(a[i][j]+" ");

					diagonal_sum += a[i][j]; // calculating diagonalsum
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		return diagonal_sum;	
	}
}