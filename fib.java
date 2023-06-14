public class fib{
public static void main(String[] args){
	int a,b,c;
	a=0;
	b=1;
	while(a<6){
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
	}
}
}
