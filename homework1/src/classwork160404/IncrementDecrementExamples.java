package classwork160404;

public class IncrementDecrementExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int counter = 0;
    System.out.println(counter); //0
    System.out.println(++counter);//1
    System.out.println(counter);//1
    System.out.println(counter--);//1
    System.out.println(counter);
    
    
    int x = 3;
    int y = ++x * 5 / x-- + --x;
    System.out.println("x=" + x);
    System.out.println("y=" + y);
    
    x++;
    
	}

}
