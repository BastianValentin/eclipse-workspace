
public class Main {

	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		int z = 17;
		
		if (x > y && x > z)
			System.out.println("x is the highest number!:" + x);
		else if (y > x && y > z)
			System.out.println("y is the highest number!:" + y);
		else if (z > x && z > y)
			System.out.println("z is the highest number!:" + z);
		else
			System.out.println("The numbers are equal.");
		
		if (x < y && x < z)
			System.out.println("x is the lowest number!:" + x);
		else if (y < x && y < z)
			System.out.println("y is the lowest number!:" + y);
		else if (z < x && z < y)
			System.out.println("z is the lowest number!:" + z);
		else
			System.out.println("The numbers are equal.");
		
		int oneorsix = 5;
		
		if (oneorsix == 1 || oneorsix == 6)
			System.out.println("Lille eller stor");
		else
			System.out.println("not 1 or 6! But:" + oneorsix);
	}

}
