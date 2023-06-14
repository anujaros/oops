import java.util.Scanner;


class Complex {
	int real, img;
	

	public void readValues() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter real and imaginary parts: ");
		real = input.nextInt();
		img = input.nextInt();
	}
}	

public class Program4 {
	public static void main(String[] args) {
		Complex a, b, c;
		a = new Complex();
		b = new Complex();
		c = new Complex();		
		a.readValues();
		b.readValues();
		c.real = a.real + b.real;
		c.img = a.img + b.img;
		System.out.println("Sum: " + c.real + " + " + c.img + "i");

	}
}
