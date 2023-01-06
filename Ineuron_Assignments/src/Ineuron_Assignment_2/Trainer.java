package Ineuron_Assignment_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Trainer {
	
	String name;
	String department;
	String email;
	int id;
	public Trainer(String name,String department,String email,int id) {
		this.name=name;
		this.department=department;
		this.email=email;
		this.id=id;
	}
	
	public static void main(String[] args) {
		Trainer trainer1=new Trainer("Mukesh" ,"Testing","mukesh@gmail.com",1);
		trainer1.teachSelenium();
		Trainer trainer2=new Trainer("Hitesh" ,"Dev","mukesh@gmail.com", 2);
		trainer2.teachWebDev();
		Trainer trainer3=new Trainer("Mukesh" ,"Testing","mukesh@gmail.com",3);
		trainer3.teachDevOps();
		//storing trainer info in an array
		Trainer[] arr1= {trainer1,trainer2,trainer3};
		for(int i=0;i<arr1.length;i++) {
			System.out.println("Name of the trainer is: "+arr1[i].name+",Department is: "+ arr1[i].department+",Email ID is: "+arr1[i].email);
		}
		//storing trainer info in arraylist
		ArrayList<Trainer>trainerInfo=new ArrayList<>();
		trainerInfo.add(trainer1);
		trainerInfo.add(trainer2);
		trainerInfo.add(trainer3);
		System.out.println("Mukesh's email is: "+trainerInfo.get(0).email);
		
	}
	public void teachSelenium() {
		
		System.out.println(name+" Teaches Selenium");
		
	}
	public void teachWebDev() {
		
		System.out.println(name+" Teaches Web Development");
		
	}
	public void teachDevOps() {
		System.out.println(name+" Teaches Devops");
	}

}
