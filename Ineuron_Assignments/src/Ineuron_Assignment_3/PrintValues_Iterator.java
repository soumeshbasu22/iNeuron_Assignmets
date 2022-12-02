package Ineuron_Assignment_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintValues_Iterator {
	
	public static void main(String args[]) {
		
		List<Integer>int_list=new ArrayList<>();
		for(int i=2;i<=20;i=i+2) {
			
			int_list.add(i);         //creating List of even numbers till 20
			
		}
		System.out.println(int_list);
		for(Iterator<Integer>iter=int_list.iterator();iter.hasNext();) {
			System.out.println(iter.next());
		}
	}

}
