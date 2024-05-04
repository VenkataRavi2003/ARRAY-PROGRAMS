import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the size of array : ");
			int size = sc.nextInt();

			int a[] = new int[size];

			System.out.println("\nEnter the array elements :");
			takeInput(a,sc);

			Arrays.sort(a); // IN BINARY SEARCH WE FOUND THE TARGET VALUE IF & ONLY IF ARRAY IS SORTED.

			System.out.println("\nResulted Array After Sorting : ");
			printArray(a);

			System.out.print("\nEnter the target element : ");
			int target = sc.nextInt();

			int index = binarySearch(a,target);

			if(index != -1)
				System.out.println("\n"+target+" -> Present At : "+index);
			else
				System.out.println("\n"+target+" -> Not Found In Array!!");

		}catch(Exception e){
			System.out.println("\n"+e.getMessage());
		}
	}
	public static void takeInput(int a[],Scanner sc)throws Exception{

		for (int i = 0 ; i < a.length ; ++i) {
			a[i] = sc.nextInt();	
		}
	}
	public static void printArray(int a[])throws Exception{

		for (int item : a) {
			System.out.print(item+" ");
		}
	}

	public static int binarySearch(int a[] , int target){

		int start = 0, end = a.length - 1 , mid = -1;

		while(start <=  end){

			mid = (start + end) / 2;

			if(a[mid] == target){
				return mid;

			}else if(a[mid] < target){

				start = mid + 1;
			}else{

				end = mid - 1;
			}
		}

		return -1;
	}
}
