public class paliandrome{
	public static void main(String[] args){
		int r,d,n,t;
		r=0;
		n=121;
		t=n;
		while(n>0){
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		if(r==t){
			System.out.println("121 is a paliandrome");
		}
		else{
			System.out.println("121 is not a paliandrome");
		}
	}
}
