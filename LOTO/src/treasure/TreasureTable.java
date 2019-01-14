package treasure;

import java.util.Random;

public class TreasureTable implements ChanceOfTreasureDropAndLoot{
	
	static Random r = new Random();

	@Override
	public int chanceToDropTreasure(int chanceToDropTreasure) {
		chanceToDropTreasure = r.nextInt(100-0)+0;
		return chanceToDropTreasure;
	}

	@Override
	public int typeOfLoot(int typeOfLoot) {
		typeOfLoot = r.nextInt(100 - 10)+10;
		return 0;
	}
}