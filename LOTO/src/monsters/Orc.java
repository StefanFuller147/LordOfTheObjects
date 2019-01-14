package monsters;

import java.util.Random;

public class Orc implements Monster {
	
	static Random r = new Random();

	@Override
	public int health(int health) {
		health = r.nextInt(15-5)+5;
		return health;
	}

	@Override
	public int chanceToHit(int chanceToHit) {
		chanceToHit = r.nextInt(20-0)+0;
		return chanceToHit;
	}

	@Override
	public int doesDamage(int damage) {
		damage = r.nextInt(5-1)+1;
		return damage;
	}
}
