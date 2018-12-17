package stores;

import globalShit.SleepyThread;
import playerCharacter.HeroTemplate;

public class Alchemist {
	static SleepyThread st = new SleepyThread();
	public static void alchemyShit(HeroTemplate hero){
		System.out.println("The Alchemist is this way");
		st.stHalf("The crier takes you by the hand and leads you down a dingey alley way.");
	}
}
