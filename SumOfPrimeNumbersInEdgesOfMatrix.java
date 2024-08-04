import java.util.Scanner;
import java.util.InputMismatchException;
public class SumOfPrimeNumbersInEdgesOfMatrix{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter no.of rows : ");
			int rows = sc.nextInt();

			System.out.print("\nEnter no.of columns : ");
			int cols = sc.nextInt();

			int arr[][] = new int[rows][cols];

			System.out.println("\nEnter the elements into matrix : ");
			takeInput(arr,sc,rows,cols);

			System.out.println("\n:: Resulted Matrix :: ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			printArrayInMatrixForm(arr,rows,cols);

			int primesSum = findEdgesPrimesSum(arr,rows,cols);
			System.out.println("\nEdges Primes Sum = "+primesSum);
		}catch (InputMismatchException e) {
			System.out.println("\nInputMismatchException Occured :: "+e.getMessage());
		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(int arr[][],Scanner sc,int rows,int cols){
		for (int i = 0 ; i < rows ; ++i) {
			for (int j = 0 ; j < cols ; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}
	}
	public static void printArrayInMatrixForm(int arr[][],int rows,int cols){
		for (int i = 0 ; i < rows ; ++i) {
			for (int j = 0 ; j < cols ; ++j) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static int findEdgesPrimesSum(int arr[][],int rows,int cols){

		int primesSum = 0;

		for (int i = 0 ; i < rows ; ++i) {
			for (int j = 0 ; j < cols ; ++j) {
				if(i == 0 || j == 0 || i == rows - 1 || j == cols - 1){
					if(isPrime(arr[i][j]))
					primesSum += arr[i][j];
				}
			}
		}
		return primesSum;
	}
	public static boolean isPrime(int num){
		if(num < 2)return false;
		for (int i = 2 ; i <= Math.sqrt(num); ++i) {
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
}