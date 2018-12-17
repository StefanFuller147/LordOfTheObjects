package stores;

import globalShit.SleepyThread;
import playerCharacter.HeroTemplate;

public class GeneralStore {
	static SleepyThread st = new SleepyThread();
	public static void generalStoreShit(HeroTemplate hero){
		System.out.println("The General store is down main street, follow me!");
		st.stHalf("You start to follow the Crier down the main street");
	}
}
