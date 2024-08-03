public class Prob7{
	public static void main(String [] args){
		int sum = 0;
		int number = 12345;
		while(number>0){
			int digit = number%10;
			sum += digit;
			number = number/10;
		}
		
		System.out.println("Sum of all the digits of number is: " + sum);
	}
	
}
