package Ineuron_Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class PrintValues_forLoop {
	
	public static void main(String args[]) {
		
		List<Integer>int_list=new ArrayList<>();
		for(int i=1;i<=20;i=i+2) {
			
			int_list.add(i);
			
		}
		System.out.println(int_list);
		for(int j=0;j<=int_list.size();j++) {
			System.out.println(int_list.get(j));
		}
	}

}
