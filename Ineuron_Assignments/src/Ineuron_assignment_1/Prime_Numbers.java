package Ineuron_assignment_1;

public class Prime_Numbers {
	
	public static void main(String args[]) {
		
		for(int i=1;i<1000;i++) {
			int flag=1;
			for(int n=2;n<=i/2;n++) {
				if(i%n==0) {
				flag=0;
				break;
				}
				
			}
			if(flag==1) {
				System.out.println(i);
			}
			
		}
	}
}



