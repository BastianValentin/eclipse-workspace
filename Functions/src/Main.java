
public class Main {

	/*
	 * Functions to call:
	 */
	
	static void hw() {
		System.out.println("Hello world!");
	}
	
	static void helloNumber(int x, int y) {
		System.out.println("Hello " + x + " and " + y);
	}
	
	static int addNumbers(int x, int y) {
		int result = x + y;
		return result;
	}
	
	static void tenTabel() {
		for(int i = 0;i <=90;) {
			i+=10;
			System.out.println("Ten tabel: " + i);
		}
	}
	
	static int tenTimesValue(int x) {
		int result = x * 10;
		return result;
	}
	
	static void oneToTenTabel(int x) {
		if (x == 10 || x == 9 || x == 8 || x == 7 || x == 6 || x == 5 || x == 4 || x == 3 || x == 2 || x == 1) {
			for(int i = 0;i <x*10;) {
				i+=x;
				System.out.println(x + "-Tabel: " + i);
			}
	}	
		
	}
	/*
	 * Program:
	 */
	public static void main(String[] args) {


		/*for(int i=0; i<= 5; i++) {
			hw();
		}
		
		helloNumber(9,6);

		
		int result = addNumbers(5,5);
		
		System.out.println(result);
		
		for (int i=0; i<=2;i++) {
			tenTabel();
		}
		
		int result2 = tenTimesValue(7);
		System.out.println("result2; " + result2);
		*/
		oneToTenTabel(1);
		oneToTenTabel(2);
		oneToTenTabel(3);
		oneToTenTabel(4);
		
		
	}

}
