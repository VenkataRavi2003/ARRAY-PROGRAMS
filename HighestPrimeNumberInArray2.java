import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
public class HighestPrimeNumberInArray2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size;
            while (true) {
                System.out.print("\nEnter the size of array: ");
                size = sc.nextInt();
                if (size > 0) break;
                System.out.println("\n" + size + " -> size must be greater than zero!!");
            }
            int arr[] = new int[size];
            System.out.println("\nEnter the elements: ");
            takeInput(arr, sc);

            System.out.println("\nResulted Array: \n" + Arrays.toString(arr));

            int highestPrime = findHighestPrime(arr);

            System.out.println("\nHighest Prime Number = "+highestPrime);


        } catch (Exception e) {
            System.out.println("\nException Occurred :: " + e.getMessage());
        }
    }

    public static void takeInput(int arr[], Scanner sc) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = getValidInput(sc);
        }
    }

    public static int getValidInput(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input! Please enter a valid integer.");
                sc.next(); 
            }
        }
    }
    public static int findHighestPrime(int arr[]){

        int max = -1;

        for(int i = 0 ; i < arr.length ; ++i){

            if(isPrime(arr[i])){

                if(max < arr[i]){

                    max = arr[i];
                }
            }
        }
        return max;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  

        for (int i = 2; i <= Math.sqrt(num); ++i) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
