import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a = scanner.nextDouble();
		System.out.println("Enter the value of b:");
		b = scanner.nextDouble();
		
		c = Math.sqrt((a*a)+(b*b));
		System.out.println("The Hypotenuse is:"+c);
		scanner.close();
		
	}

}