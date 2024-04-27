import java.util.Scanner;
public class PalindromeArrayOrNot{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");

		int size = sc.nextInt();

		if(size <= 0){
			System.out.println("\n"+size+" => Array size must greater than zero !!");
			sc.close();
			return;
		}

		int a[] = new int[size];

		System.out.println("\nEnter the elements : ");
		takeInput(sc,a);

		System.out.println("\nResulted Array : ");
		printArray(a);

		if(isPalindromeArray(a)){

			System.out.println("\nYes,it is palindrome array .");

		}else{
			System.out.println("\nNot a palindrome array !");
		}

		sc.close();
	}
	public static void takeInput(Scanner sc , int a[]){
		for (int i = 0 ;i<a.length ; ++i) {

			a[i] = sc.nextInt();
			
		}
	}
	public static void printArray(int a[]){
		for(int item:a){
			System.out.print(item+" ");
		}
	}
	public static boolean isPalindromeArray(int a[]){

		for (int item : a) {

			if(!isPalindrome(item)){
				return false;
			}
			
		}
		return true;
	}
	public static boolean isPalindrome(int num){

		int rev = 0;
		int temp = num;

		while(temp != 0){

			int rem =  temp % 10;

			rev = (rev*10)+rem;

			temp /= 10;
		}

		return rev == num;
	}
}