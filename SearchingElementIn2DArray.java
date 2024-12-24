import java.util.Scanner;
import java.util.InputMismatchException;
public class SearchingElementIn2DArray{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int rows , cols;
			System.out.println("\nEnter no.of rows & Columns : ");
			while (true) {
				rows = getValidInput(sc);
				cols = getValidInput(sc);
				if(rows > 0 && cols > 0) break;
				System.out.println("\nRows & Columns must be greater than zero!"); 
			}
			int matrix[][] = new int[rows][cols];
			System.out.println("\nEnter the elements into matrix : ");
			takeInput(matrix,rows,cols,sc);

			System.out.println("\n:: Resulted Matrix :: ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			printMatrix(matrix);

			System.out.println("\nEnter the element need to search : ");
			int target = getValidInput(sc);

			int indicies[] = linearSearch(matrix,rows,cols,target);

			if(indicies[0] != -1 && indicies[1] != -1){
				System.out.println("\n"+target+" Found At : "+indicies[0]+" row , "+indicies[1]+" column.");
			}else{
				System.out.println("\n"+target+" Not Found In Matrix!");
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void takeInput(int matrix[][],int rows,int cols,Scanner sc){
		for (int i = 0 ; i < rows ; ++i) {
			for (int j = 0 ; j < cols  ; ++j) {
				
				matrix[i][j] = getValidInput(sc);
			}
		}
	}
	public static int getValidInput(Scanner sc){
		while (true) {
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid Input!Please Enter Valid Integer As Input.");
				sc.next();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void printMatrix(int matrix[][]){
		for (int row[] : matrix) {
			for (int item : row) {
				System.out.print(item+"\t");
			}
			System.out.println();
		}
	}
	public static int[] linearSearch(int matrix[][],int rows,int cols,int target){
 
		for (int i = 0 ; i < rows ; ++i) {
			for (int j  = 0 ; j < cols ; ++j) {
				
				if(target == matrix[i][j]){
					return new int[]{i,j};
				}
			}
		}
		return new int[]{-1,-1};
	}
}