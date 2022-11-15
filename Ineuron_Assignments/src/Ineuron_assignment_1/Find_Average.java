package Ineuron_assignment_1;

public class Find_Average {
	
	public static float avg(double arr[]) {
		float sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		float average=sum/arr.length;
		return average;
	}
	
	public static void main(String args[]) {
		double[] arr1= {10,90.78,111,8989,7876};
		System.out.println(Find_Average.avg(arr1));
	}

}
