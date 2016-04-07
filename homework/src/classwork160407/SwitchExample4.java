package classwork160407;

public class SwitchExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args == null) {
			System.exit(1);

		}
		if (args.length == 0) {
			System.out.println("Usage: <hello phrase>");
			System.exit(0);
		}

		switch (args[0]) {
		case "Hello":
			System.out.println("Hi there!");
			break;
		case "Привет":
			System.out.println("Здоров");
			break;
		case "Шолом":
			System.out.println("Лэхаим");
			break;
		default:
			System.out.println("улыбаемся и машем!");

		}
	}
	
	

}
