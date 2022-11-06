import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> directions = new ArrayList<>();
		ArrayList<String> streets = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		String strt = "HOME";
		while (!strt.equals("SCHOOL")) {
			String dir = sc.nextLine().equals("R")?"LEFT":"RIGHT";
			directions.add(dir);
			streets.add(strt);
			strt = sc.nextLine();
		}
		
		for (int i=directions.size()-1;i>=0;i--) {
			String dir = directions.get(i);
			strt = streets.get(i);
			
			if (!strt.equals("HOME"))
				System.out.println("Turn "+dir+" onto "+strt+" street.");
			else
				System.out.println("Turn "+dir+" into your "+strt +".");
			
		}
		
	}

}
