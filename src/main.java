import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		double weight,height,bodyMass;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your weight .");
		weight = scanner.nextDouble();
		
		System.out.println("Enter your height .");
		height = scanner.nextDouble();
		
		bodyMass = weight / (height * height);
		
		
		System.out.println("Your body mass index is :"+bodyMass);
		
	}

}
