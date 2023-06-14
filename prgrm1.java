class product{
	String name,code;
	double price;

	public void readdata(String pname,String pcode,double pprice){
		name=pname;
		code=pcode;
		price=pprice;
	}
}
public class prgrm1{
	public static void main(String[] args){
		product p1=new product();
		product p2=new product();
		product p3=new product();
		p1.readdata("dove","soap",15.00);
		p2.readdata("classmate","book",40.00);
		p3.readdata("lexi","pen",5.00);
		if(p1.price < p2.price){
			if(p1.price < p3.price){
				System.out.println("lowest price is "+p1.price);
			}
			else{
				System.out.println("lowest price is "+p3.price);
			}
		}
		else{
			if(p2.price < p3.price){
				System.out.println("lowest price is "+p2.price);
			}
			else{
				System.out.println("lowest price is "+p3.price);
			}
		}
	}
}
