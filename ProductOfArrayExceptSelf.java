import java.util.Scanner;
public class ProductOfArrayExceptSelf{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the size of array : ");
		int size = sc.nextInt();

		if(size <= 0){
			System.out.println("\n"+size+" -> Array size must be greater than zero!!");
			sc.close();
			return;
		}
		int arr[] = new int[size];

		System.out.println("\nEnter the array elements : ");
		takeInput(arr,sc);

		System.out.println("\nResulted Array : ");
		printArray(arr);

		int res[] = findProductOfArrayElementsExceptSelf(arr);

		System.out.println("\nProduct Of Array Elements Except Self : ");
		printArray(res);

		sc.close();
	}
	public static void takeInput(int arr[],Scanner sc){
		for (int i = 0 ; i < arr.length ; ++i) {
			arr[i] = sc.nextInt();
		}
	}
	public static void printArray(int arr[]){
		for (int item : arr) {
			System.out.print(item+"\t");
		}
	}
	public static int[] findProductOfArrayElementsExceptSelf(int arr[]){

		int res[] = new int[arr.length];

		for (int i = 0; i < arr.length ; ++i) {
			
			int product = 1;

			for (int j = 0 ; j < arr.length ; ++j) {
				
				if(i == j)continue;

				product *= arr[j];
			}

			res[i] = product;
		}
		return res;
	}
}