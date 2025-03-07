import java.util.Scanner;
public class AverageMeanForArrayElements{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of elements you need to find the average : ");
		int size = sc.nextInt();

		if(size <= 0){
			System.out.println("\n"+size+" -> Array Size Must Greater Than Zero !!");
			sc.close();
			return;
		}

		float [] a = new float[size];

		System.out.println("\nEnter the elements : ");
		takeInput(sc,a);

		System.out.print("\nResulted Array : ");
		printArray(a);

		float mean = findMean(a);

		System.out.println("\nAverage Mean : "+mean);

		sc.close();

	}
	public static void takeInput(Scanner sc, float a[]){

		for (int i = 0; i < a.length ; ++i) {
			
			 a[i] = sc.nextFloat();
		}
	}
	public static void printArray(float a[]){

		for (float item : a) {

			System.out.print(item+" ");
			
		}
	}
	public static float findMean(float a[]){

		float sum = 0;

		for (float item : a) {
			
			sum += item;
		}

		return sum / a.length;
	}
}
