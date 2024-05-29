import java.util.Scanner;
import java.util.Arrays;
class UnionOfTwoArrays{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter 1st size array : ");
		int size1=sc.nextInt();
		if(size1<=0){
			System.out.println("\nInvalid Size..!");
			return;
		}
		int a[]=new int[size1];
		System.out.println("\nEnter the elements : ");
		for(int i=0;i<a.length;++i){
			a[i]=sc.nextInt();
		}
		System.out.print("\nEnter the 2nd size array : ");
		int size2=sc.nextInt();
		if(size2<0){
			System.out.println("\nInvalid Size..!");
			return;
		}
		int b[]=new int[size2];
		System.out.println("\nEnter the elements : ");
		for(int i=0;i<b.length;++i){
			b[i]=sc.nextInt();
		}
		System.out.print("\n1st Array -> ");
		for(int item:a)
			System.out.print(item+" ");
		System.out.print("\n2nd Array -> ");
		for(int item:b)
			System.out.print(item+" ");
		String result="";
		for(int i=0;i<a.length;++i){
			if(!result.contains(a[i]+""))
				result+=a[i]+",";
		}
		for(int i=0;i<b.length;++i){
			if(!result.contains(b[i]+"")){
				result+=b[i]+",";
			}
		}
		String union[]=result.split(",");
		System.out.println("\nUnion Of Two Arrays => "+Arrays.toString(union));
	}
}
