import java.util.Scanner;
public class FirstAndLastOccurenceIndexOfElement{
	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("\nEnter the size of array : ");
		 int size = sc.nextInt();

		 if(size < 0){
		 	System.out.println("\n"+size+" -> Array Size Can't Be Negative !!");
		 	sc.close();
		 	return;
		 }

		 int arr[] = new int[size];

		 System.out.println("\nEnter the array elements : ");
		 takeInput(sc,arr);

		 System.out.println("\nResulted Array : ");
		 printArray(arr);

		 System.out.print("\nEnter the element need to search : ");
		 int targetElement = sc.nextInt();

		 findFirstAndLastOccurence(arr,targetElement);

		 sc.close();
	}
	public static void takeInput(Scanner sc , int arr[]){

		for(int i=0;i<arr.length;++i){
			arr[i] = sc.nextInt();
		}
		
	}
	public static void printArray(int arr[]){

		for (int item : arr) {

			System.out.print(item+" ");	
		}
	}
	public static void findFirstAndLastOccurence(int arr[] , int targetElement){

		int firstOccurence = -1, lastOccurence = -1;

		for(int i=0;i<arr.length;++i){

			if(arr[i] == targetElement){
				firstOccurence = i;
				break;
			}
		}

		for(int i = arr.length-1; i >= 0; --i){

			if(arr[i] == targetElement){

				lastOccurence = i;
				break;
			}
		}

		System.out.println("\nFirst Occurence : "+firstOccurence);
		System.out.println("\nlast Occurence  : "+lastOccurence);
	}
}