import java.util.Scanner;

public class DecisionMaking {

	
	public static void main(String[] args) {
		System.out.print("What's your name? ");
		Scanner name = new Scanner(System.in);
		String userName = name.nextLine();
		number(userName);
		
		name.close();
	}
	
	
	
	public static void number(String userName) {
		System.out.print(userName + ", enter a number between 1 and 100: ");
		
		Scanner scnr = new Scanner(System.in);
		int input = scnr.nextInt();
		
		if (!(input >= 1) || !(input <= 100)) {
			System.out.println(userName + ", please follow the directions");
			number(userName);
		}
		else if (input%2 == 0 && input <25) {
			System.out.println("Even and less than 25");
			repeat(userName);
		}
		else if (input%2 == 0 && input >60) {
			System.out.println(input + " and Even");
			repeat(userName);
		}
		else if (input%2 == 0 && input >= 26 || input%2 == 0 && input <=60) {
			System.out.println("Even");
			repeat(userName);
		}
		else if (input%2 != 0 && input >60) {
			System.out.println("Odd and over 60");
			repeat(userName);
		}
		else if (input%2 != 0) {
			System.out.println(input + " and Odd");
			repeat(userName);
		}
		
		scnr.close();
	}
		
	public static void repeat(String userName) {
		
		Scanner confirm = new Scanner(System.in);
		System.out.print("Continue? (y/n) ");
		String Answer = confirm.nextLine();
		
		if (Answer.equals("n")) {
			System.out.println();
			System.out.println("OK, bye " + userName + "!" );
		}
		else if (Answer.equals("y")) {
			number(userName);
		}
		else {
			System.out.println("please only enter 'y' or 'n'");
			repeat(userName);
		}
		
		confirm.close();

}
	
}
