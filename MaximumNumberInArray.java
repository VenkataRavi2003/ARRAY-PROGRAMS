import java.util.Scanner;
public class MaximumNumberInArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");
		int size=sc.nextInt();

		if(size < 0){
			System.out.println("\n"+size+" -> Array Size Can't Be Negative !!");
			sc.close();
			return;
		}

		int a[] = new int[size];

		System.out.println("\nEnter the elements : ");
		for(int i=0;i<a.length;++i){
			a[i]=sc.nextInt();
		}

		System.out.print("\nResulted Array : ");
		printArray(a);

		int max = findMaximum(a);

		System.out.println("\nMaximum Element : "+max);

		sc.close();
	}
	public static void printArray(int a[]){
		for (int item : a) {
			System.out.print(item+" ");
		}
	}

	public static int findMaximum(int a[]){

		int max = a[0];

		for(int i = 1;i < a.length ; ++i){

			if(max < a[i]){
				max = a[i];
			}
		}
		return max;
	}
}
	
