package stores;

import globalShit.SleepyThread;
import playerCharacter.HeroTemplate;

public class Armory {
	static SleepyThread st = new SleepyThread();
	public static void armoryShit(HeroTemplate hero){
		System.out.println("Alright, the Armorer is this way");
		st.stHalf("The Crier whisks you away to the Armorer");
	}

}
