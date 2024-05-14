import java.util.Scanner;
public class LeftUpperTriangleMatrixSum{

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

		System.out.println("\nEnter matrix elements : ");
		takeInput(a,sc);

		System.out.println("\nResulted Matrix");
		printArrayInMatrix(a);

		System.out.println("\nLeft Upper Triangle Matrix");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		int sum = findLeftUpperTriangleMatrixSumAndPrintMatrix(a);

		System.out.println("\nLeft Upper Triangle Matrix Sum : "+sum);

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
	public static int findLeftUpperTriangleMatrixSumAndPrintMatrix(int a[][]){

		int sum = 0;

		for (int i = 0 ; i < a.length ; ++i) {
			for (int j = 0 ; j < a[i].length ; ++j) {
				
				if(i >= j){
					sum += a[i][j];
					System.out.print(a[i][j]+"\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		return sum;
	}
}