import java.util.Scanner;
public class IntersectionOfTwoArrays{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the sizes of 1st & 2nd arrays : ");
		int size1 = sc.nextInt(),size2 = sc.nextInt();

		if(size1 <= 0 || size2 <= 0){
			System.out.println("\nArray Size Must Be Greater Than Zero!!");
			sc.close();
			return;
		}

		int arr1[] = new int[size1];
		int arr2[] = new int[size2];

		System.out.println("\nEnter 1st array elements : ");
		takeInput(arr1,sc);

		System.out.println("\nEnter 2nd array elements : ");
		takeInput(arr2,sc);

		System.out.println("\n1st Array : ");
		printArray(arr1);

		System.out.println("\n2nd Array : ");
		printArray(arr2);

		int res[] = findIntersectionOfTwoArrays(arr1,arr2);

		System.out.println("\nIntersection Of Two Arrays : ");
		printArray(res);

		sc.close();
	}
	public static void takeInput(int arr[],Scanner sc){
		for (int i = 0; i < arr.length ; ++i) {
			arr[i] = sc.nextInt();
		}
	}
	public static void printArray(int arr[]){
		for (int item : arr) {
			System.out.print(item+" ");
		}
	}
	public static int[] findIntersectionOfTwoArrays(int arr1[],int arr2[]){

		int res[] = new int[arr1.length];
		
	}
}