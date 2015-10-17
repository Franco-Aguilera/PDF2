import java.util.Scanner;

public class PDF2Salary {

	public static void main(String[] args) {
		
		double hoursWorked = 0;
		double basePay = 0;
		double payment = 0;
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Hours worked?");
		hoursWorked = user_input.nextDouble();
		System.out.println("Base pay?");
		basePay = user_input.nextDouble();
		
		if(hoursWorked>=60 || basePay<=8){
			System.out.println("Error");
		}else{
		
		if(hoursWorked>40){
			payment = (40*basePay) + ((hoursWorked-40)*1.5);
			System.out.println("The employee has $" + payment);
		}
		else{
			payment = (hoursWorked*basePay);
			System.out.println("The employee has $" + payment);

	}

	}
}
}