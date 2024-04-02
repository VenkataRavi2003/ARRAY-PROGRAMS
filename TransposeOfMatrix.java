import java.util.Scanner;
public class TransposeOfMatrix{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter no.of rows : ");
		int rows = sc.nextInt();
		
		System.out.print("\nEnter no.of columns : ");
		int columns = sc.nextInt();
		
		if(rows <= 0 || columns <= 0){
			System.out.println("\nInvalid Input! Number of rows and columns must be postive.");
			sc.close();
			return;
		}
		
		int a[][] = new int[rows][columns];
		int b[][] = new int[columns][rows];
		
		System.out.println("\nEnter the elements : ");
		for(int i = 0;i < a.length; ++i){
			
			for(int j = 0;j < a[i].length; ++j){
				
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nBefore Transposing ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		printArray(a);
		
		//transposing matrix
		for(int i = 0;i < columns; ++i){
			
			for(int j = 0;j < rows; ++j){
				
				b[i][j] = a[j][i];
			}
		}
		
		System.out.println("\nAfter Transposing ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		printArray(b);
		
	}
	public static void printArray(int arr[][]){
		for(int i = 0;i < arr.length; ++i){
			
			for(int j = 0; j<arr[i].length;++j){
				
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}