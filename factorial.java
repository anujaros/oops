public class factorial{
	public static void main(String[] args){
		int f,n;
		n=1;
		f=1;
		while(n<=5){
			f=f*n;
			n=n+1;
		}
		System.out.println("factorial of 5 is "+f);
	}
}
