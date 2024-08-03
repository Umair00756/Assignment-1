import java.util.Scanner;

public class JavaApplication33 {
    public static void main(String[] args) {
		
		
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Enter the total selling price of 15 items: ");
        double totalSellingPrice = scanner.nextDouble();      
        double costPrice = totalSellingPrice / 1.20;
        double costOfOneItem = costPrice / 15;
        System.out.println("The cost price of one item is: " + costOfOneItem);

        
    }
}