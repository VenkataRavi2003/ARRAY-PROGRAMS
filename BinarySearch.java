import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");
		int size = sc.nextInt();
		
		if(size < 0){
			System.out.println("\n"+size+" -> Array Size Can't Be Negative !!");
			sc.close();
			return;
		}
		int a[] = new int[size];
		System.out.println("\nEnter the array elements : ");
		for(int i=0;i<a.length;++i){
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.println("\nResulted Array After Sorting : ");
		printArray(a);
		
		System.out.print("\nEnter the element need to searh : ");
		int target = sc.nextInt();
		
		int index = binarySearch(a,target);
		
		if(index != -1){
			System.out.println("\n"+target+" -> Found At : "+index+" Index.");
		}else{
			System.out.println("\n"+target+" -> Not Found !!");
		}
		
		sc.close();
	}
	public static void printArray(int a[]){
		for(int item : a)
			System.out.print(item+" ");
	}
	public static int binarySearch(int a[],int target){
		int index = -1;
		
		int start = 0 , end = a.length-1 , mid = -1;
		while(start <= end){
			mid = (start + end) / 2;
			if(a[mid] == target){
				index = mid;
				return index;
			}else if(a[mid] < target){
				start = mid + 1;
			}else{
				end = mid - 1;
			}
		}
		return index;
	}
}