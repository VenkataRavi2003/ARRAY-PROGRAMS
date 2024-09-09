import java.util.Scanner;
import java.util.InputMismatchException;
public class RowWiseAndColumnWiseSum{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int rows,cols;
			while (true) {
				System.out.print("\nEnter no.of rows : ");
				rows = sc.nextInt();
				cols = sc.nextInt();

				if(rows > 0 && cols > 0) break;

				System.out.println("\nRow & Column size must be greater than zero!!");
			}

			int arr[][] = new int[rows][cols];
			System.out.println("\nEnter the elements into matrix : ");
			takeInput(arr,rows,cols,sc);

			System.out.println("\n:: Resulted Array :: ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
			printArrayInMatrix(arr);

			findRowSumAndColumnSum(arr,rows,cols);

		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(int arr[][],int rows,int cols,Scanner sc){

		for (int i = 0 ; i < rows ; ++i) {
			
			for (int j = 0 ; j < cols ; ++j) {
				
				arr[i][j] = getValidInput(sc);
			}
		}
	}
	public static int getValidInput(Scanner sc){
		while (true) {
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid input!!please enter valid integer as input.");
				sc.next();
			}
		}
	}
	public static void printArrayInMatrix(int arr[][]){

		for(int row [] : arr){

			for (int item : row) {
				
				System.out.print(item+"\t");
			}
			System.out.println();
		}
	}
	public static void findRowSumAndColumnSum(int arr[][],int rows,int cols){

		for (int i = 0 ; i < rows ; ++i) {
			
			int rowSum = 0 , colSum = 0;

			for (int j = 0 ; j < cols ; ++j) {
				
				rowSum += arr[i][j];
				colSum += arr[j][i];
			}

			System.out.println("\n"+(i+1) +" -> row sum = "+rowSum);
			System.out.println("\n"+(i+1) +" -> column sum = "+colSum);
		}
	}
}