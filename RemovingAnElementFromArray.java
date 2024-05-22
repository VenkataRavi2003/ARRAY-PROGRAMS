import java.util.Scanner;
import java.util.Arrays;
public class RemovingAnElementFromArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");

		int size = sc.nextInt();
		if(size <= 0){
			System.out.println("\n"+size+" --> Array size must be greater than zero!");
			sc.close();
			return;
		}

		int arr[] = new int[size];

		System.out.println("\nEnter the elements : ");
		takeInput(arr,sc);
		System.out.println("\nResulted Array :: "+Arrays.toString(arr));

		System.out.print("\nEnter the element need to remove : ");
		int element = sc.nextInt();

		if(isElementExists(arr,element)){

			int res[] = removeElement(arr,element);

			System.out.println("\nAfter Removing The Element :: "+Arrays.toString(res));

		}else{
			System.out.println("\n"+element+" -> Element Doesn't Exists In Resulted Array..");
		}
		sc.close();

	}
	public static void takeInput(int arr[],Scanner sc){
		for (int i = 0; i < arr.length ; ++i) {
			arr[i] = sc.nextInt();
		}
	}
	public static boolean isElementExists(int arr[],int element){

		for (int item : arr) {
			if(item == element){
				return true;
			}
		}
		return false;
	}
	public static int[] removeElement(int arr[],int element){

		int res[] = new int[arr.length-1];
		int index = 0;

		for (int i = 0 ; i < arr.length ; ++i) {

			if(arr[i] == element)continue;

			res[index++] = arr[i];
		}
		return res;
	}
}