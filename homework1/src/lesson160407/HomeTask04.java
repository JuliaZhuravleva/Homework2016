package lesson160407;

public class HomeTask04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int r = 14;
//		System.out.println(Integer.toBinaryString(r));

		int x = 14;
		System.out.println(x);
		while (x != 0) {
			System.out.println(x % 2);
			x = x >> 1;
		}

	}
}