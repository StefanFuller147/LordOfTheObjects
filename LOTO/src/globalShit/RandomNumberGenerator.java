package globalShit;

import java.util.Random;

public class RandomNumberGenerator {
	static Random r = new Random();
	
	public static int rollForCharacterStats(int sum){
		sum = r.nextInt(20-9) + 9;
		return sum;
	}
	

}
