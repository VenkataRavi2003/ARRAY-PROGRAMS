import java.util.Scanner;
public class ProductOfTwoMatrices{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter no.of rows : ");
		int rows = sc.nextInt();

		System.out.print("\nEnter no.of columns : ");
		int columns = sc.nextInt();

		if(rows <= 0 || columns <= 0){
			System.out.println("\nRows & Columns must be greater than zero!");
			sc.close();
			return;
		}

		int a[][] = new int[rows][columns];
		int b[][] = new int[rows][columns];

		System.out.println("\nEnter 1st matrix elements : ");
		takeInput(a,sc);

		System.out.println("\nEnter 2nd matrix elements : ");
		takeInput(b,sc);

		System.out.println("\n1st Matrix");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		printArrayInMatrix(a);

		System.out.println("\n2nd Matrix");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		printArrayInMatrix(b);

		int c[][] = findProductOfTwoMatrices(a,b,rows,columns);

		System.out.println("\nProduct Of Two Matrices");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		printArrayInMatrix(c);

		sc.close();

	}
	public static void takeInput(int arr[][],Scanner sc){

		for (int i = 0 ; i < arr.length ; ++i) {
			for (int j = 0 ; j < arr[i].length ; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}
	}
	public static void printArrayInMatrix(int arr[][]){

		for (int i = 0; i < arr.length ; ++i) {
			for (int j = 0 ; j < arr[i].length; ++j) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static int[][] findProductOfTwoMatrices(int a[][],int b[][],int rows,int columns){

		int c[][] = new int[rows][columns];

		for (int i = 0 ; i < a.length ; ++i) {
			for (int j = 0 ; j < b.length ; ++j) {
				for (int k = 0; k < a[i].length ; ++k) {
					
					c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
				}
			}
		}
		return c;
	}
}