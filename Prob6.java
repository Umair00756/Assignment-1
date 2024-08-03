import java.util.Scanner;
public class Prob6{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base: ");
		double base = sc.nextDouble();
		System.out.println("Enter exponent: ");
		double exp = sc.nextDouble();
		double power = Math.pow(base, exp);
		System.out.println("Power :" + power);
	}
	
}