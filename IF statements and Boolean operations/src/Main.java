
public class Main {

	public static void main(String[] args) {

		//boolean minBool = 1 < 2;
		
		int salg = 200;
		int indkøb = 150;
		int overskud = 0;
		
		if(salg > indkøb) {
			System.out.println("Vi har overskud!");
			overskud = salg - indkøb;
			System.out.println(overskud);
		}
		if (5 > 2) {
			System.out.println("Det er sandt!");
			System.out.println("Bummelum!");
		}	

		int min1 = 55;
		int min2 = 60;
		
		if (min1 > min2)
			System.out.println(min1);
		else
			System.out.println(min2);
		
		int min3 = 50;
		int min4 = 50;
		
		
		System.out.println("!Egual test!");
		if (min3 == min4) {
			System.out.println("They are equal!");
			System.out.println("min3= " + min3 + " og " + "min4= " + min4);
		}
		else 
			System.out.println("Not equal!");
		
		int min5 = 1;
		int min6 = 2;
		
		System.out.println("Not equal test!");
		if (min5 != min6)
			System.out.println("min5= " + min5 + " og " + "min6= " + min6);
		else 
			System.out.println("Equal!");
		
	}

}
