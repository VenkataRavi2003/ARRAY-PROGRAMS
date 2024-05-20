import java.util.Scanner;
public class IsPalindromicArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");
		int size = sc.nextInt();

		if(size <= 0){
			System.out.println("\n"+size+" -> Array size must be greater than zero!!");
			sc.close();
			return;
		}
		int arr[] = new int[size];

		System.out.println("\nEnter the elements : ");
		takeInput(arr,sc);

		System.out.println("\nResulted Array : ");
		printArray(arr);

		if(isPalindromicArray(arr)){
			System.out.println("\nThe Resulted Array Is Palindromic Array.");
		}else {
			System.out.println("\nIt Is Not An Palindromic Array!");
		}

		sc.close();
	}
	public static void takeInput(int arr[],Scanner sc){
		for (int i = 0 ; i  < arr.length ; ++i) {
			arr[i] = sc.nextInt();
		}
	}
	public static void printArray(int arr[]){
		for (int item : arr) {
			System.out.print(item+" ");
		}
	}
	public static boolean isPalindromicArray(int arr[]){
	
    	for (int i = 0 ; i < arr.length ; ++i) {
			
			if(!isPalindrome(arr[i])){
				return false;
			}
		}
		return true;
	}
	public static boolean isPalindrome(int num){
		int rev = 0,temp = num;

		while (temp != 0) {
			int rem = temp % 10;
			rev = (rev * 10) + rem;
			temp /= 10;
		}
		return rev == num;
	}
}