package Ineuron_Assignment_2;

import java.util.Scanner;

public class scanner_class {
	
	public static void main(String args[]) {
		String id;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of the students");
		String number=sc.nextLine();
		
			System.out.println("Enter the name of the student");
			String name_1=sc.nextLine();
			System.out.println("Enter the email of the student");
			String email_1=sc.nextLine();
			System.out.println("Enter the phone number of the student");
			String phone_1=sc.nextLine();
			System.out.println("Enter the address of the student");
			String address_1=sc.nextLine();
			
			System.out.println("Enter the name of the student");
			String name_2=sc.nextLine();
			System.out.println("Enter the email of the student");
			String email_2=sc.nextLine();
			System.out.println("Enter the phone number of the student");
			String phone_2=sc.nextLine();
			System.out.println("Enter the address of the student");
			String address_2=sc.nextLine();
			System.out.println("Enter the student details you are looking for");
			id=sc.nextLine();
		if(id.equals("1")) {
			System.out.println(name_1);
			System.out.println(email_1);
			System.out.println(address_1);
			System.out.println(phone_1);
			
		}
		if(id.equals("2")) {
			System.out.println(name_2);
			System.out.println(email_2);
			System.out.println(address_2);
			System.out.println(phone_2);
			
		}
	}

}
