package mainStory;

import java.util.Scanner;

import globalShit.SleepyThread;
import playerCharacter.HeroTemplate;
import stores.Alchemist;
import stores.Armory;
import stores.GeneralStore;
import stores.Pub;

public class MainVillage {
	static SleepyThread st = new SleepyThread();
	static Scanner kb = new Scanner(System.in);
	
	static int placeInTownToGo;
	public static void startingVillage(HeroTemplate hero) {
		System.out.println("You enter through the main gates of a town after many weeks of travel");
		st.stHalf("You are approached by a local crier, they walk up to you and ask if you'd like a quick tour of the town.");
		st.st1("Crier,  \" Hello good traveler, haven't seen your fuckin face around here recently, you must be new. Would you care for a tour of the town?\"");
		st.st1("You accept their offer because I'm lazy and don't feel like putting a conditional in here yet");
		st.st1("NOTE TO SELF: TODO, \"PUT A CONDITIONAL IN HERE TO SEE IF PLAYERS WANT TO EXPLORE THE TOWN THEMSELVES. BUT FOR NOW...FUCK EM\"");
		System.out.println();
		st.stHalf("Crier, \"Would you like to visit the... \n1)Pub \n2)General Store \n3)Alchemist \n4)Armorer?\"");
		do{
			 placeInTownToGo = kb.nextInt();
			 if(placeInTownToGo > 4 || placeInTownToGo < 1){
				 System.out.println(placeInTownToGo + " is not a valid option dipshit, try again. This time in the number range given");
			 }
		}while(placeInTownToGo > 4 || placeInTownToGo < 1);
		
		if(placeInTownToGo == 1){
			Pub.pubShit(hero);
		}
		else if(placeInTownToGo == 2){
			GeneralStore.generalStoreShit(hero);
		}
		else if(placeInTownToGo == 3){
			Alchemist.alchemyShit(hero);
		}
		else if(placeInTownToGo == 4){
			Armory.armoryShit(hero);
		}
	}
}
	
