package globalShit;

import java.util.Random;

public class RandomNumberGenerator {
	static Random r = new Random();
	
	public static int rollForCharacterStats(int sum){
		sum = r.nextInt(20-9) + 9;
		return sum;
	}
<<<<<<< HEAD
=======
	

>>>>>>> 403a58a344aeb4b72514ede3aa604c85ae7fa083
}
