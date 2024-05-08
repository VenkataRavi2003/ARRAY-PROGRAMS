import java.util.Scanner;
class RowWiseSumIn3By3Matrix{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("\nEnter the elements >");
		for(int i=0;i<a.length;++i){
			for(int j=0;j<a[i].length;++j){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nResulted Matrix");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<a.length;++i){
			for(int j=0;j<a[i].length;++j){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int firstRowSum=0,secondRowSum=0,thirdRowSum=0;
		for(int i=0;i<a.length;++i){
			for(int j=0;j<a[i].length;++j){
				if(i==0){
					firstRowSum+=a[i][j];
				}else if(i==1){
					secondRowSum+=a[i][j];
				}else if(i==a.length-1){
					thirdRowSum+=a[i][j];
				}
			}
		}
		System.out.println("\n1st row sum >> "+firstRowSum);
		System.out.println("2nd row sum >> "+secondRowSum);
		System.out.println("3rd row sum >> "+thirdRowSum);
	}
}