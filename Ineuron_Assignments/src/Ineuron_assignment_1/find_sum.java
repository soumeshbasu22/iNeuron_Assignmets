package Ineuron_assignment_1;

public class find_sum {
	
	public static double sum(double arr1[]) {
		int total=0;
		for(int i=0;i<arr1.length;i++) {
			total+=arr1[i];
		}
		
		return total;
		
	}
	public static void main(String args[]) {
		double arr1[]= {10,90.78,111,8989,7876};
		System.out.println("The total sum is "+find_sum.sum(arr1));
	}

}
