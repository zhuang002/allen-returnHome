import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> directions = new Stack<>();
		Stack<String> streets = new Stack<>();
		Scanner sc = new Scanner(System.in);
		
		
		String strt = "HOME";
		while (!strt.equals("SCHOOL")) {
			String dir = sc.nextLine().equals("R")?"LEFT":"RIGHT";
			directions.push(dir);
			streets.push(strt);
			strt = sc.nextLine();
		}
		
		while (!directions.isEmpty()) {
			String dir = directions.pop();
			strt = streets.pop();
			
			if (!strt.equals("HOME"))
				System.out.println("Turn "+dir+" onto "+strt+" street.");
			else
				System.out.println("Turn "+dir+" into your "+strt);
			
		}
		
	}

}
