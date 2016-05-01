//Session_3_Assignment1 : 30.4.2016
//Author : Kamakshi Abbi
import java.util.Scanner;
public class Calculate {
	double number;
	public Calculate(double number){
		this.number = number;
	}
	public double calculateSquareRoot(){
		return (Math.sqrt(number));    
	}
	public double calculateCubeRoot(){
		return (Math.cbrt(number));
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number");
		double num = input.nextDouble();
		Calculate obj = new Calculate(num);
		input.close();
		System.out.println("The square root of " + num +" is "+ obj.calculateSquareRoot());
		System.out.println("The cube root of " + num + " is "+ obj.calculateCubeRoot());
	
	}
}
