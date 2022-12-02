package Ineuron_Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class Sum_of_Numbers {
	
	public static int sum(List<Integer>num_list) {
		int sum=0;
		for(int i=0;i<num_list.size();i++) {
			sum+=num_list.get(i);
		}
		return sum;
	}
	public static void main(String args[]) {
		List<Integer>num_list= new ArrayList<Integer>();
		num_list.add(20);
		num_list.add(32);
		num_list.add(44);
		num_list.add(48);
		System.out.println(sum(num_list));
	}

}
