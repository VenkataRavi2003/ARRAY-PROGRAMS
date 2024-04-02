import java.util.Scanner;
public class LinearSearch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");
		int size=sc.nextInt();
		if(size<0){
			System.out.println("\nArray Size Can't Be Negative !!");
			sc.close();
			return;
		}
		int a[]=new int[size];
		
		System.out.println("\nEnter the elements : ");
		for(int i=0;i<a.length;++i){
			a[i]=sc.nextInt();
		}
		System.out.println("\nResulted Array : ");
		printArray(a);
		
		System.out.print("\nEnter the element need to search  : ");
		int element =sc.nextInt();
		
		int index = linearSearch(a,element);
		
		if(index != -1){
			System.out.println("\n"+element+" Found At -> "+index+" Index.");
		}else{
			System.out.println("\n"+element+" Not Found !!");
		}
		sc.close();
	}
	public static void printArray(int a[]){
		for(int item:a){
			System.out.print(item+" ");
		}
	}
	public static int linearSearch(int a[],int element){
		for(int i=0;i<a.length;++i){
			if(a[i] == element){
				return i;
			}
		}
		return -1;
	}
}