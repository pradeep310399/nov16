package november16;

public class Factorial {

	public static void main(String[] args) {
		//declare input as 5   
		int num = 5;
		//declare fact as integer
		int fact=1;
		//iteration with loop
		for(int i = 1;i<=num;i++) {
			
	    //multiply fact with iteration
			
			fact=fact*i;
			
			
		}
		//print the factorial
		System.out.println("factorial:"+fact);
		
		

	}

}
