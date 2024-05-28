import java.util.Scanner;
import java.util.ArrayList;
class SegregatingEven_OddNumbersInArray{
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.print("\nEnter the size of array > ");
		int size=sc.nextInt();

		if(size<=0){
			System.out.println("\n"+size+" -> Array size must be greater than zero!!");
			sc.close();
			return;
		}
		
		int a[]=new int[size];
		System.out.println("\nEnter the elements >");
		for(int i=0;i<a.length;++i){
			a[i]=sc.nextInt();
		}
		System.out.print("\nResulted Array >> ");
		for(int item:a){
			System.out.print(item+" ");
		}
		ArrayList<Integer>evenList=new ArrayList<Integer>();
		ArrayList<Integer>oddList=new ArrayList<Integer>();
		for(int i=0;i<a.length;++i){
			if(a[i]%2==0){
				evenList.add(a[i]);
			}else{
				oddList.add(a[i]);
			}
		}
		System.out.print("\nEven Numbers List >> ");
		for(Integer element:evenList){
			System.out.print(element+" ");
		}
		System.out.print("\nOdd Numbers List >> ");
		for(Integer element:oddList){
			System.out.print(element+" ");
		}
	}
}
