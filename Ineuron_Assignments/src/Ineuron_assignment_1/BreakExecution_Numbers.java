package Ineuron_assignment_1;

public class BreakExecution_Numbers {
	
	public static void breakexecution(int arr1[],int m) {
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==m) {
				System.out.println("Required number found"+":"+m);
				break;
			}
			System.out.println("Required no not found");
		}
		
	}
	public static void main(String[] args) {
		int[] arr1= {12,34,66,85,900};
		breakexecution(arr1, 85);
	}

}
