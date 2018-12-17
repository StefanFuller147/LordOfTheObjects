package stores;

import globalShit.SleepyThread;
import playerCharacter.HeroTemplate;

public class Pub {
	static SleepyThread st = new SleepyThread();

	public static void pubShit(HeroTemplate hero) {
		System.out.println("Alrighty, to the pub we go!");
		st.stHalf("The Crier takes you to the pub");
		
	}

}
