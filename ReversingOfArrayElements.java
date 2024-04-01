import java.util.Scanner;
public class ReversingOfArrayElements{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the size of array : ");
		int size =  sc.nextInt();
		
		if(size < 0){
			System.out.println("\n"+size+" -> Array Size Can't Be Neagtive !!");
			sc.close();
			return;
		}
		int a[] = new int[size];
		
		System.out.println("\nEnter the array elements : ");
		takeInput(a,sc);
		
		System.out.println("\nBefore Reversing : ");
		printArray(a);
		
		revereArray(a);
		
		System.out.println("\nAfter Reverging  : ");
		printArray(a);
	}
	public static void takeInput(int arr[],Scanner sc){
		for(int i=0;i<arr.length;++i){
			arr[i] = sc.nextInt();
		}
		sc.close();
	}
	public static void revereArray(int arr[]){
		
		int start = 0,end = arr.length-1;
		
		while(start < end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			++start;
			--end;
		}
	}
	public static void printArray(int arr[]){
		for(int item : arr)
			System.out.print(item+" ");
	}
}