package arrays;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SortTheOddElements {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter the size of array : ");
			int size;
			while(true) {
				size = getValidInput(sc);
				if(size > 0)break;
				System.out.println("\n"+size+" -> array size must be greater than zero!");
			}
			int arr[] = new int[size];
			System.out.println("\nEnter the elements : ");
			takeInput(arr,sc);
			
			System.out.println("\nBefore Sorting : "+Arrays.toString(arr));
			
			sortTheOddElements(arr);
			
			System.out.println("\nAfter Sorting : "+Arrays.toString(arr));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void takeInput(int arr[],Scanner sc) {
		int i=0;
		do {
			arr[i] = getValidInput(sc);
			i++;
		}while(i < arr.length);
	}
	public static int getValidInput(Scanner sc) {
		while (true) {
			try {
				return sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("\nInvalid Input!Please enter valid integer as input.Try Again : ");
				sc.next();
			}
		}
	}
	public static void sortTheOddElements(int arr[]) {
		int numOfOddElements = findNumOfOddElements(arr);
		
		int odds[] = new int[numOfOddElements];
		
		int index=0;
		for(int i=0;i<arr.length;++i) {
			if(arr[i] % 2 != 0) {
				odds[index++] = arr[i];
			}
		}
		bubbleSort(odds);
		index = 0;
		
		for(int i=0;i<arr.length;++i) {
			if(arr[i]%2 != 0) {
				arr[i] = odds[index++];
			}
		}
	}
	public static int findNumOfOddElements(int arr[]) {
		int count=0;
		for (int i : arr) {
			if(i%2!=0)++count;
		}
		return count;
	}
	public static void bubbleSort(int odds[]) {
		
		for (int i = 0; i < odds.length - 1; i++) {
			
			for (int j = 0; j < odds.length - i - 1; j++) {
				
				if(odds[j] > odds[j+1]) {
					int temp = odds[j];
					odds[j] = odds[j+1];
					odds[j+1] = temp;
				}
			}
		}
	}
}
