package Practice;
import java.util.Random;

public class Gun {
	private int bullets;
	private Random random;
	
	public Gun() {
		bullets = 100;
		random = new Random();
	}
	
	public int getBullets() {
		return bullets;
	}
	
	public void setBullets(int bullets) {
		this.bullets = bullets;
	}
	
	public int aim() {
		int hitChance = random.nextInt(100);
		if (hitChance < 20) {
			return 0;
		} else if (hitChance < 50) {
			return 1;
		} else if (hitChance < 80) {
			return 2;
		} else {
			return 3;
		}
	}
}