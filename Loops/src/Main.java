
public class Main {

	public static void main(String[] args) {
		int i=0;
		
		while(i <= 10) {
			System.out.println(i);
			
			i++;
		}
		
		//do-while loop always runs the do code no matter if the conditions is true. 
		int x=0;
		
		do {
			System.out.println("Always runs this code.");
			System.out.println(x);
			x++;
		} while(x<=12);
		
		for(int u=0; u <= 1000; u+=100)
			System.out.println(u);

		//10 tabellen
		
		int wtt=10;
		
		for(int tt=10; tt <= 100; tt +=10)
			System.out.println("tt: " + tt);
		
		while(wtt<=100) {
			System.out.println("while tt: " + wtt);
			
			wtt += 10;
		}
		
		// 20 iterations [0:19]. Print all equal numbers. 
		
		for(int ti=0; ti<20; ti++) {
			System.out.println("Tyve iterationer: " + ti);
			if(ti%2==0)
				System.out.println("Even numbers: " + ti);
			}
		}
		
		
	

}
