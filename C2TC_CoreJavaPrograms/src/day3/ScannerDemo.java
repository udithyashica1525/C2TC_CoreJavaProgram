package day3;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner =  new Scanner(System.in);
       
       System.out.println("Enter your Name :");
       String name = scanner.next();
       
       System.out.println("Enter your Age");
       int age = scanner.nextInt();
       
       System.out.println("Enter your Salary: ");
       double salary =  scanner.nextDouble();
       
       System.out.println("Name: " +name);
       System.out.println("Age: " +age);
       System.out.println("Salary" +salary);
       
	}

}
