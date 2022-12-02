package Ineuron_Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class List_operations {
	
	public static void main(String args[]) {
		
		List<Integer>list1=new ArrayList<>();
		list1.add(33);
		list1.add(44);
		list1.add(55);
		list1.add(66);
		list1.add(77);
		list1.add(88);
		System.out.println(list1);
		list1.remove(1);
		list1.remove(1);
		list1.add(3, 90);
		for(int i=0;i<list1.size();i++) {
			System.out.println("Elements of list is"+list1.get(i));  //printing the values of updated list
		}
		
		int[] arr1=new int[list1.size()];
		for(int j=0;j<list1.size();j++) {
			arr1[j]=list1.get(j);
		}
		
	for(int j=0;j<arr1.length;j++) {
		System.out.println("Elements of array is"+arr1[j]);  //gettng values of array
	}
}
}
