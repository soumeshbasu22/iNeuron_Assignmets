package Ineuron_assignment_1;

public class swap_numbers {
	
	public static void swap(int a,int b) {
		int c=a;
		a=b;
		b=c;
		System.out.println("Now a is"+ a);
		System.out.println("Now b is"+ b);
	}
	
	public static void main(String args[]) {
		int a=10;
		int b=20;
		swap_numbers.swap(a,b);
	}

}
