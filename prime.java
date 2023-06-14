public class prime{
	public static void main(String[] args){
		int a=5;
		boolean isprime=true;
		for(int i=2;i<a;i++){
			if(a%i==0){
				isprime=false;
				break;
			}
		}
		if(isprime){
			System.out.println(a+" is prime");
		}
		else{
			System.out.println(a+" is not a prime");
		}
	}
}

