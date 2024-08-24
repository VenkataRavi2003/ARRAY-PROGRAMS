import java.util.Scanner;
import java.util.InputMismatchException;
public class SymmetricMatrix{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter no.of rows : ");
			int rows = sc.nextInt();

			System.out.print("\nEnter no.of columns : ");
			int cols = sc.nextInt();

			int arr[][] = new int[rows][cols];
			System.out.println("\nEnter the elements into matrix : ");
			takeInput(arr,sc);

			System.out.println("\n:: Resulted Matrix :: ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			printArrayInMatrixForm(arr);

			if(isSymmetricMatrix(arr,rows,cols)){
				System.out.println("\nResulted Array Is Symmetric Matrix.");
			}else {
				System.out.println("\nResulted Array Is Not Symmetric Matrix!!");
			}

		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(int arr[][],Scanner sc){
		for (int i = 0 ; i < arr.length ; ++i) {
			for (int j = 0 ; j < arr[i].length ; ++j) {
				arr[i][j] = getValidInput(sc);
			}
		}
	}
	public static int getValidInput(Scanner sc){
		while (true) {
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid input! please enter valid integer as input.");
				sc.next();
			}
		}
	}
	public static void printArrayInMatrixForm(int arr[][]){
		for (int[]row : arr) {
			for (int item : row) {
				System.out.print(item+"\t");
			}
			System.out.println();
		}
	}
	public static boolean isSymmetricMatrix(int arr[][],int rows,int cols){
		for (int i = 0 ; i < arr.length ; ++i) {
			for (int j = 0 ; j < arr[i].length ; ++j) {
				if(arr[i][j] != arr[j][i]){
					return false;
				}
			}
		}
		return true;
	}
}