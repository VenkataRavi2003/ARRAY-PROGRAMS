import java.util.Scanner;
public class TwoSum{
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);

		System.out.print("\nEnter the size of array : ");
		int size = sc.nextInt();

		if(size <= 0){
			System.out.println("\n"+size+" -> size must be greater than zero!!");
			return;
		}

		int arr[] = new int[size];

		System.out.println("\nEnter the elements into array : ");
		takeInput(arr,sc,size);

		System.out.println("\nResulted Array : ");
		printArray(arr);

		System.out.print("\nEnter the target sum : ");
		int targetSum = sc.nextInt();

		int result[] = twoSum(arr,targetSum);

		System.out.println("\nIndicies : "+result[0]+" && "+result[1]);

		sc.close();
	}
	public static void takeInput(int arr[] , Scanner sc,int size){

		for (int i = 0 ; i < size ; ++i) {
			arr[i] = sc.nextInt();
		}
	}
	public static void printArray(int arr[]){
		for (int item : arr) {
			System.out.print(item+" ");
		}
	}
	public static int[] twoSum(int arr[],int targetSum){

		for (int i = 0 ; i < arr.length ; ++i) {
			
			for (int j = i + 1 ; j < arr.length  ; ++j) {
				
				if(arr[i] + arr[j] == targetSum){

					return new int[] {i , j};
				}
			}
		}

		throw new IllegalArgumentException("No two sum solution!!");
	}
}