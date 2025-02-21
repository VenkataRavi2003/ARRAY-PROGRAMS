import java.util.Arrays;
import java.util.Scanner;
public class SortTheEvenElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("\nEnter the elements : ");
		ComparingTwoArrays.takeUserInput(arr, sc);
		System.out.println("\nBefore Array : ");
		ComparingTwoArrays.printArray(arr);
		
		sortTheEvenElements(arr);
		System.out.println("\nAfter Sorting : ");
		ComparingTwoArrays.printArray(arr);	
		sc.close();
	}
	public static void sortTheEvenElements(int arr[]) {
		if(arr.length == 0 || arr.length == 1) {
			return;
		}
		int evenNumbersSize = 0;
		for(int item:arr) {
			if(item % 2 == 0) {
				++evenNumbersSize;
			}
		}
		int evens[] = new int[evenNumbersSize];
		int index=0;
		for(int i=0;i<arr.length;++i) {
			if(arr[i] % 2 == 0) {
				evens[index] = arr[i];
				index++;
			}
		}
		bubbleSort(evens);
//		Arrays.sort(evens);
		
		int x=0;
		for(int i=0;i<arr.length;++i) {
			
			if(arr[i] % 2 == 0) {
				arr[i] = evens[x];
				x++;
			}
		}
	}
	public static void bubbleSort(int evens[]) {
		for (int i = 0; i < evens.length-1; i++) {
			boolean flag = false;
			for (int j = 0; j < evens.length-1-i; j++) {
				
				if(evens[j] > evens[j+1]) {
					int temp = evens[j];
					evens[j] = evens[j+1];
					evens[j+1] = temp;
					flag = true;
				}
			}
			if(!flag)break;
		}
	}
}
