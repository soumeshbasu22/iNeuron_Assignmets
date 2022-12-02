package Ineuron_Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class Array_to_List {
	
	public static List<Integer> toList(int[]arr1){
		
		List<Integer>lt=new ArrayList<>();
		for(int i=0;i<arr1.length;i++) {
			lt.add(arr1[i]);
		}
		
		return lt;
		
	}
	public static void main(String args[]) {
		int[] arr1= {20,78,98,90,76};
		System.out.println(toList(arr1));
	}

}
