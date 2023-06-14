import java.util.*;
class CPU{
	double price;
	CPU(double price){
		this.price=price;
	}

	class processor{
		int number_of_cores;
		String manufacturer;
		processor(int n,String m){
			number_of_cores=n;
			manufacturer=m;
		}
	}
	static class RAM{
		int memory;
		String manufacturer;
		RAM(int memory,String manufacturer){
			this.memory=memory;
			this.manufacturer=manufacturer;
		}
	}
}

public class program5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter cpu price:");
		CPU cpu=new CPU(input.nextDouble());
		System.out.print("enter number of cores,cpu manufacturer:");
		CPU.processor p = cpu.new processor(input.nextInt(),input.next());
		System.out.print("enter ram size,manufacturer:");
		CPU.RAM ram =new CPU.RAM(input.nextInt(),input.next());
		System.out.println("CPU DETAILS:");
		System.out.println("price:"+cpu.price);
		System.out.println("cpu cores:"+p.number_of_cores);
		System.out.println("cpu manufacturer:"+p.manufacturer);
		System.out.println("ram size:"+ram.memory);
		System.out.println("ram manufacturer:"+ram.manufacturer);
		
	}
}
		
