package lesson160405;

import java.util.Arrays;

public class HomeTaskIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		if (args.length == 0) {
			System.out.println("Usage: HomeTaskIfElse <number>");
			System.exit(0);
			
		} else {
			
			String argString = Arrays.toString(args);
			System.out.println(argString);
			
			int x = Integer.parseInt(args[0]);
			
			if (x == 5) {
				System.out.println("Мало");
			} else if (x == 2) {
				System.out.println("Много");
			} else if (x == 1) {
				System.out.println("В самый раз");
			} else {
				System.out.println("Не понятно");
			}
		}
		
	}
	
}

	


