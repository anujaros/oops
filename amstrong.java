public class amstrong{
	public static void main(String[] args){
		int d,s,n,t;
		n=153;
		s=0;
		t=n;
		while(n>0){
			d=n%10;
			s=s+d*d*d;
			n=n/10;
		}
		if(t==s){
			System.out.println("153 is an amstrong");
		}
		else{
			System.out.println("153 is not an amstrong");
		}
	}
}
