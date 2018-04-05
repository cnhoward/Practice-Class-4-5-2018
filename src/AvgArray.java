import java.util.Scanner;

public class AvgArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Enter 5 numbers");
int[] numbers = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()}; 
int sum = 0;



for (int i = 0; i<=numbers.length-1; i++){
	
	sum = sum + numbers[i];
	
	
}


System.out.println(sum/numbers.length);
//int avg = ((numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]) / 5);
		
//System.out.println("The average of the numbers is " + avg);
	}

}
