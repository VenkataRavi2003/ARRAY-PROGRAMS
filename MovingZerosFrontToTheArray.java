import java.util.Scanner;
public class MovingZerosFrontToTheArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");
		int size =sc.nextInt();
		if(size<=0){
			System.out.println("\n"+size+" -> Array size must be greater than zero!!");
			sc.close();
			return;
		}
		int[]a = new int[size];

		System.out.println("\nEnter the elements : ");
		takeInput(a,sc);

		System.out.println("\nBefore Moving Zeros To Front : ");
		printArray(a);

		moveZeroToFront(a);

		System.out.println("\nAfter Moving Zeros To Front  : ");
		printArray(a);

		sc.close();
	}
	public static void takeInput(int a[],Scanner sc){
		for (int i=0;i<a.length ; ++i) {
			a[i]=sc.nextInt();
		}
	}
	public static void printArray(int a[]){
		for (int item : a) {
			System.out.print(item+" ");
		}
	}
	public static void moveZeroToFront(int a[]){
		int index = a.length-1;

		for (int i = a.length-1; i >= 0 ; --i) {
			if(a[i] != 0){
				a[index--] = a[i];
			}
		}
		while (index >= 0) {
			a[index--] = 0;
		}
	}
}