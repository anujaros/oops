import java.util.Scanner;

public class prgrm2{
	public static void main(String[] args){
		System.out.println("enter size of elements:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[10];
		System.out.println("enter elements:");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println("array elements:");
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		System.out.println("after sort:");
		int temp;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}
