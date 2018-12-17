package stores;

import java.util.Scanner;

import globalShit.SleepyThread;
import mainStory.MainVillage;
import playerCharacter.HeroTemplate;

public class GeneralStore {
	static SleepyThread st = new SleepyThread();
	static Scanner kb = new Scanner(System.in);
	
	static int goBackToTown;
	public static void generalStoreShit(HeroTemplate hero){
		System.out.println("The General store is down main street, follow me!");
		st.stHalf("You start to follow the Crier down the main street");
		
		System.out.println("hit 1 to return to the town");
		goBackToTown = kb.nextInt();
		
		if(goBackToTown == 1){
			MainVillage.whereToGoInTown(hero);
		}
	}
}
