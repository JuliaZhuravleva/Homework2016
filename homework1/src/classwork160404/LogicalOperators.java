package classwork160404;


public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y = 5;
		boolean x = true || (y < 4);
		boolean x = true | (y < 4);
		System.out.println(x);
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
	}

}
