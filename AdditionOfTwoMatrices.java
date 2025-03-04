import java.util.Scanner;
public class AdditionOfTwoMatrices{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter no.of rows & columns for 1st matrix : ");
		
		int rows1 = sc.nextInt(), columns1 = sc.nextInt();

		if(rows1 < 0 || columns1 < 0){
			System.out.println("\nRows And columns Not Be Negative !!");
			sc.close();
			return;
		}

		int a[][] = new int[rows1][columns1];

		System.out.println("\nEnter 1st matrix elements : ");

		takeIntput(a,sc);

		System.out.print("\nEnter no.of rows & columns for 2nd matrix : ");
		
		int rows2 = sc.nextInt(), columns2 = sc.nextInt();

		if(rows2 < 0 || columns2 < 0){
			System.out.println("\nRows And columns Not Be Negative !!");
			sc.close();
			return;
		}

		int b[][] = new int[rows2][columns2];

		System.out.println("\nEnter 2nd matrix elements : ");
		takeIntput(b,sc);


		System.out.println("\n1st Matrix ");
		System.out.println("~~~~~~~~~~~~~~");
		printArray(a);

		System.out.println("\n2nd Matrix");
		System.out.println("~~~~~~~~~~~~~~");
		printArray(b);

		if(rows1 != rows2 || columns1 != columns2){
			System.out.println("\nMatrices cannot be added. Dimensions are Different!");
			sc.close();
			return;
		}
		int res[][] = new int[rows1][columns1];

		matrixAddition(res,a,b);

		System.out.println("\nAddition Of Two Matrices");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		printArray(res);

		sc.close();
	}
	public static void takeIntput(int arr[][],Scanner sc){

		for(int i=0;i<arr.length;++i){
			for(int j=0;j<arr[i].length;++j){
				arr[i][j] = sc.nextInt();
			}
		}
	}

	public static void printArray(int arr[][]){
		for (int i=0;i<arr.length;++i ) {
			for (int j=0;j<arr[i].length ;++j ) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void matrixAddition(int res[][],int a[][],int b[][]){
		for(int i=0;i<res.length;++i){
			for(int j=0;j<res[i].length;++j){
				res[i][j]=a[i][j]+b[i][j];
			}
		}
	}
}
