package november16;

public class Armstrongnumber {

	public static void main(String[] args) {
		int num=153;
		int calculate = 0;
		int rem,original;
		original=num;
		
		
		while(num>0) {
			
			rem = num % 10;
			calculate = calculate+(rem*rem*rem);
			num=num / 10;
		}
			
			if(original==calculate) {
				System.out.println("The number is armstrong number");
			}else 
				{
					System.out.println("The number is not armstrong number");
				}
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		

	


