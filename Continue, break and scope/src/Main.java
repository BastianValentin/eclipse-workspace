
public class Main {

	public static void main(String[] args) {

		int money = 100;
		int buy = 20;
		int usedMoney = 0;
		
		while(money >= buy) {
			money -= buy;
			usedMoney += buy;
			
			System.out.println(usedMoney);
		}
		
		System.out.println(usedMoney);
		
		for(int i = 1;i <=100; i++) {
			
			if(i==20)
				continue;
			
			System.out.println(i);
	
			if(i==75)
				break;
		}
			
		int u = 0;
		
		while(u <= 99) {
			
			u++;
			if(u==20)
				continue;
			
		System.out.println("u: " + u);
		
		if(u==75)
			break;
		}
		
		int health = 1000;
		
		while(health > 0) {
			int damage = 10;
			health = health - damage;
			System.out.println("Health: " + health);
		}
		
	}

}
