import java.util.Scanner;
import java.util.InputMismatchException;
public class Even_Odd_IndexesSum{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter the size of array : ");
			int size = sc.nextInt();

			int a[] = new int[size];
			System.out.println("\nEnter the elements into array : ");
			takeInput(a,sc);

			System.out.println("\nResulted Array : ");
			printArray(a);

			findEvenAndOddSum(a);

		}catch (InputMismatchException e) {
			e.printStackTrace();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void takeInput(int a[],Scanner sc)throws Exception{
		for (int i = 0 ; i < a.length ; ++i) {
			a[i] = sc.nextInt();
		}
	}
	public static void printArray(int a[]){
		for (int item : a) {
			System.out.print(item+"\t");
		}
	}
	public static void findEvenAndOddSum(int a[]){
		int even_sum = 0, odd_sum = 0;
		for (int i = 0 ; i < a.length; ++i) {

			if(i % 2 == 0){

				even_sum += a[i];
			}else{

				odd_sum += a[i];
			}
		}

		System.out.println("\nEven Indexes Sum : "+even_sum);
		System.out.println("\nOdd Indexes Sum  : "+odd_sum);
	}
}