import java.util.Scanner;
public class ZigZagMerging{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the sizes of array1 & array2 : ");
		int size1 =sc.nextInt(),size2=sc.nextInt();
		
		if(size1 < 0 || size2 < 0){
			System.out.println("\nArray Size Can't Be Negative !!");
			sc.close();
			return;
		}
		
		int a[]=new int[size1];
		System.out.println("\nEnter 1st array elements : ");
		takeIntput(a,sc);
		
		int b[]=new int[size2];
		System.out.println("\nEnter 2nd array elements : ");
		takeIntput(b,sc);
		
		System.out.println("\n1st Array : ");
		printArray(a);
		
		System.out.println("\n2nd Array : ");
		printArray(b);
		
		int res[] = new int[size1+size2];
		
		mergeTwoArrays(res,a,b);
		
		System.out.println("\nAfter Merging : ");
		printArray(res);
		
		sc.close();
		
	}
	public static void takeIntput(int arr[],Scanner sc){
		for(int i=0;i<arr.length;++i){
			arr[i]=sc.nextInt();
		}
	}
	public static void printArray(int arr[]){
		for(int item:arr){
			System.out.print(item+" ");
		}
	}
	public static void mergeTwoArrays(int res[],int a[],int b[]){
		int maxSize = (a.length > b.length) ? a.length : b.length;
		
		int index = 0;
		
		for(int i=0;i<maxSize;++i){
			
			if(i < a.length){
				res[index++] = a[i];
			}
			if(i < b.length){
				res[index++] = b[i];
			}
		}
		
	}
}