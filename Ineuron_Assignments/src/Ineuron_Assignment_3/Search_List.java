package Ineuron_Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class Search_List {
	
	public static boolean searchList(String input_str,List<String>lt) {
		boolean bo=false;
		for(int i=0;i<lt.size();i++) {
			if(lt.get(i).contains(input_str)) {
				bo=true;
			}
			
		}
		return bo;
	}
	public static void main(String args[]) {
		List<String>lt=new ArrayList<>();
		lt.add("Web Automation");
		lt.add("API Automation");
		lt.add("Mobile Automation");
		System.out.println(searchList("Mobile", lt));
	}

}
