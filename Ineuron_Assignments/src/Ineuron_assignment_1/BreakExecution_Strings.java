package Ineuron_assignment_1;

public class BreakExecution_Strings {
	
public static void breakexecution(String arr1[],String m) {
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==m) {
				System.out.println("Required number found"+":"+m);
				break;
			}
			System.out.println("Required no not found");
		}
		
	}
	public static void main(String[] args) {
		String[] arr1= {"Java","JavaScript","Selenium","Python","Mukesh"};
		breakexecution(arr1, "Selenium");
	}


}
