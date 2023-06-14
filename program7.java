import java.util.*;
public class program7{
	public static void main(String[] args){
		int n,x;
		int location=-1;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter size of array:");
		n=s.nextInt();

		int[] a=new int[n];

		
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		
		System.out.println("enter element you want to search:");
		x=s.nextInt();

		for(int i=0;i<n;i++){
			if(x==a[i]){
				location=i;
				break;
			}
		}
		if(location==-1){
			System.out.printf("%d is not found",x);
		}
		else{
			System.out.printf("%d is found at %d ",x,location);
		}
	}
}
				
