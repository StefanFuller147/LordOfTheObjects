package stores;

import java.util.Scanner;

import globalShit.SleepyThread;
import mainStory.MainVillage;
import playerCharacter.HeroTemplate;

public class Alchemist {
	static SleepyThread st = new SleepyThread();
	static Scanner kb = new Scanner(System.in);
	static int goBackToTown;
	
	public static void alchemyShit(HeroTemplate hero){
		System.out.println("The Alchemist is this way");
		st.stHalf("The crier takes you by the hand and leads you down a dingey alley way.");
		
		System.out.println("hit 1 to return to the town");
		goBackToTown = kb.nextInt();
		
		if(goBackToTown == 1){
			MainVillage.whereToGoInTown(hero);
		}
	}
}
