package Practice;

public class Person {
	private int health;
	private Gun gun;
	private int totalShots;
	private int headShots;
	private int chestShots;
	private int legShots;
	private int missedShots;
	private String name;

	public Person(String name) {
		health = 500;
		gun = new Gun();
		totalShots = 0;
		headShots = 0;
		chestShots = 0;
		legShots = 0;
		missedShots = 0;
		this.name = name;
		
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public Gun getGun() {
		return gun;
	}
	
	public String getName() {
		return name;
	}
	
	public void shoot(String shooterName, Person target) {
		totalShots++;
		int hitZone = gun.aim();
		switch (hitZone) {
		case 1:
			target.setHealth(target.getHealth()-50);
			System.out.println(shooterName + " shot " + target.getName() + " in the legs");
			legShots++;
			break;
		case 2:
			target.setHealth(target.getHealth()-75);
			System.out.println(shooterName + " shot " + target.getName() + " in the chest");
			chestShots++;
			break;
		case 3:
			target.setHealth(target.getHealth()-100);
			System.out.println(shooterName + " shot " + target.getName() + " in the head" );
			headShots++;
			break;
		default:
			System.out.println(shooterName + " missed the shot");
			missedShots++;
			break;
		}
	}
	
	public void displayStats() {
		double headShotPercentage = (double) headShots / totalShots * 100;
		double chestShotPercentage = (double) chestShots / totalShots * 100;
		double legShotPercentage = (double) legShots / totalShots * 100;
		double missedShotPercentage = (double) missedShots / totalShots * 100;
		
		System.out.printf("Total Shots: %d\n", totalShots);
		System.out.printf("Head Shots: %d (%.2f%%)\n", headShots, headShotPercentage);
		System.out.printf("Chest Shots: %d (%.2f%%)\n", chestShots, chestShotPercentage);
		System.out.printf("Leg Shots: %d (%.2f%%)\n", legShots, legShotPercentage);
		System.out.printf("Missed Shots: %d (%.2f%%)\n", missedShots, missedShotPercentage);

	}
}
