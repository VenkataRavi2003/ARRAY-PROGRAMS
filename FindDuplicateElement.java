import java.util.Scanner;
public class FindDuplicateElement{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");
		int size = sc.nextInt();
		if(size <= 0){
			System.out.println("\n"+size+" -> Array size must be greater than zero!!");
			sc.close();
			return;
		}
		int a[] = new int[size];

		System.out.println("\nEnter the elements : ");
		takeInput(a,sc);

		System.out.println("\nResulted Array : ");
		printArray(a);

		int duplicate = findDuplicate(a);

		System.out.println("\nDuplicate Number : "+duplicate);

		sc.close();

	}
	public static void takeInput(int a[],Scanner sc){
		for (int i = 0 ; i < a.length ; ++i) {
			a[i] = sc.nextInt();
		}
	}
	public static void printArray(int a[]){
		for (int item : a) {
			System.out.print(item+"\t");
		}
	}
	public static int findDuplicate(int a[]){

		for (int i = 0 ; i < a.length ; ++i) {
			
			int x = a[i];
			int count = 0;
			for (int j = 0 ; j < a.length ; ++j) {
				
				if(x == a[j]){
					++count;
				}
			}
			if(count >= 2){
				return a[i];
			}
		}
		return -1;
	}
}