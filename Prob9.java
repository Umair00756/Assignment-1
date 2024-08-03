import java.util.Scanner;

public class Prob9{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to withdraw : ");
        int amount = scanner.nextInt() ;  

        int note100 = 0, note50 = 0, note10 = 0;

        // Calculate the number of 100 notes
        if (amount >= 100) {
            note100 = amount / 100;
            amount = amount % 100;
        }

        // Calculate the number of 50 notes
        if (amount >= 50) {
            note50 = amount / 50;
            amount = amount % 50;
        }

        // Calculate the number of 10 notes
        if (amount >= 10) {
            note10 = amount / 10;
            amount = amount % 10;
        }

        System.out.println("N0 of 100 notes: " + note100);
        System.out.println("No of 50 notes: " + note50);
        System.out.println("No of 10 notes: " + note10);

        
		
	}
	
	
}