import java.util.Scanner;
public class BubbleSort{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the size of array : ");
		int size = sc.nextInt();

		if(size <= 0){
			System.out.println("\n"+size+" -> Array size must greater than zero !!");
			sc.close();
			return;
		}

		int a[] =new int[size];

		System.out.println("\nEnter the elements : ");
		takeInput(sc,a);

		System.out.print("\nBefore Sorting : ");
		printArray(a);

		bubbleSort(a);

		System.out.print("\nAfter Sorting : ");
		printArray(a);

		sc.close();
	}
	public static void takeInput(Scanner sc  , int a[]){

		for (int i = 0 ; i < a.length ; ++i ) {

			  a[i] = sc.nextInt();
		}
	}
	public static void printArray(int a[]){
		for (int item : a ) {

		      System.out.print(item+" ");	
		}
	}
	public static void bubbleSort(int a[]){

		for (int i = 0 ; i < a.length ; i++ ) {

			 for ( int j = 0;  j < a.length-1-i; ++j) {

			 	   if(a[j] > a[j+1]){

			 	   	  int temp  = a[j];
			 	   	  a[j] = a[j+1];
			 	   	  a[j+1] =  temp;
			 	   }

			 }
		}
	}
}