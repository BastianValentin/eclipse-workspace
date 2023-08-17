
public class Main {

	/*
	 * Functions
	 */
	static int add(int x, int y) {
		//int result = x + y;
		//return result;
		return x + y;
	}
	
	//Overload. Calling the previous function add in the new function add
	static int add(int x, int y, int z) {
		return add(x,y) + z;
	}
	
	static int add(int x, int y, int z, int k) {
		return add(x,y)+ add(z,k);
	}
	
	//A function that multiplies two integer characters and returns the answer
	static int multiply(int x, int y) {
		return x * y;
	}
	
	//Use overload principle to make an function that can multiply 2, 3 and 4 integer characters. Remember til overload( use the function in the function)
	
	static int multiply(int x, int y, int z) {
		return multiply(x,y) * z;
	}
	
	static int multiply(int x, int y, int z, int k) {
		return multiply(x,y) * multiply(z,k);
	}
	
	/*
	 * Program
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(add(2,5));
		System.out.println(add(1,2,3));
		System.out.println(add(1,2,3,4));
		System.out.println(multiply(2,2));
		System.out.println(multiply(2,2,3));
		System.out.println(multiply(1,2,3,4));

	}

}
