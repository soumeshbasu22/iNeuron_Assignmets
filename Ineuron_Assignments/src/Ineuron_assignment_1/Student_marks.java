package Ineuron_assignment_1;

public class Student_marks {
	
	public static void marks_over_80(int arr1[]) {
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>80) {
				System.out.println(arr1[i]);
			}
			
		}
	}
	public static void main(String[] args) {
		int [] arr1= {78,65,80,89,93};
		marks_over_80(arr1);
	}

}
