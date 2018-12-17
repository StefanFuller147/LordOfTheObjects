package stores;

import java.util.Scanner;

import globalShit.SleepyThread;
import mainStory.MainVillage;
import playerCharacter.HeroTemplate;

public class Pub {
	static SleepyThread st = new SleepyThread();
	static Scanner kb = new Scanner(System.in);
	static int goBackToTown;
	public static void pubShit(HeroTemplate hero) {
		System.out.println("Alrighty, to the pub we go!");
		st.stHalf("The Crier takes you to the pub");
		
		System.out.println("hit 1 to return to the town");
		goBackToTown = kb.nextInt();
		
		if(goBackToTown == 1){
			MainVillage.whereToGoInTown(hero);
		}
		
	}

}
