package Practice;

import java.util.Scanner;

public class Weapon {
	public static void main(String[] args) {

		System.out.println("Enter player 1:");
		Scanner scanner = new Scanner(System.in);
		String name1 = scanner.next();
		Person person1 = new Person(name1);
		System.out.println("Enter player 2:");
		String name2 = scanner.next();
		Person person2 = new Person(name2);
		
		while (person1.getHealth() > 0 && person2.getHealth() > 0) {
			person1.shoot(name1, person2);
			System.out.println(name2 + "'s health: " + person2.getHealth());
			sleep(1000);
			
			if (person2.getHealth() <= 0) {
				System.out.println();
				System.out.println(name1 + " wins!");
				break;
			}
			
			person2.shoot(name2, person1);
			System.out.println(name1 + "'s health: " + person1.getHealth());
			sleep(1000);
			
			if (person1.getHealth() <= 0) {
				System.out.println();
				System.out.println("------------------");
				System.out.println("   " + name2 + " wins!");
				System.out.println("------------------");
				break;
			}
		}
		
		System.out.println("\n" + name1 + "'s Stats:");
		person1.displayStats();
		System.out.println("\n" + name2 + "'s Stats: ");
		person2.displayStats();
		scanner.close();
	}
	
	private static void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}