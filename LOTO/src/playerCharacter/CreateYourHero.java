package playerCharacter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import globalShit.RandomNumberGenerator;
import globalShit.SleepyThread;
import mainStory.MainVillage;

public class CreateYourHero {
	static Scanner kb = new Scanner(System.in);
	static HeroTemplate hero = new HeroTemplate();
	static SleepyThread st = new SleepyThread();
	static RandomNumberGenerator rng = new RandomNumberGenerator();
	static String confirm;
	static int confirmRaceOrClass;
	static int sum;
	static ArrayList<String> heroClass = new ArrayList<>();
	static ArrayList<String> heroRace = new ArrayList<>();
	static ArrayList<Integer> heroStats = new ArrayList<>();

	public static void main(String[] args) {

		st.stHalf("Welcome to character creation! Please input your characters name");
		String heroName = kb.nextLine();
		do {
			st.stHalf(heroName + ", is that the name you'd like to give your hero?");
			confirm = kb.nextLine();

			if (confirm.equalsIgnoreCase("yes")) {
				hero.setName(heroName);
				System.out.println("Okay, " + hero.getName() + " is your heros new name");
				break;
			} else if (confirm.equalsIgnoreCase("no")) {
				st.stHalf("Okay, what would you like your characters name to be then?");
				st.stHalf("Re-Enter your heros name");
			}
			if (!confirm.equalsIgnoreCase("yes") || !confirm.equalsIgnoreCase("no")) {
				st.stHalf(confirm + " is not a valid answer, please answer yes or no.");
				System.out.println();
			}
		} while (confirm.equalsIgnoreCase("no"));

		st.so("Now, we need to create select your hero's class");
		st.stHalf("Please select one of the following from the list");
		heroClass.add("Cleric");
		heroClass.add("Paladin");
		heroClass.add("Thief");
		heroClass.add("Warrior");
		heroClass.add("Wizard");

		for (int i = 0; i < heroClass.size(); i++) {
			st.stHalf(i + 1 + ": " + heroClass.get(i));
		}
		do {
			do {
				confirmRaceOrClass = kb.nextInt();

				if (confirmRaceOrClass == 1) {
					hero.setHeroClass("Cleric");
				} else if (confirmRaceOrClass == 2) {
					hero.setHeroClass("Paladin");
				} else if (confirmRaceOrClass == 3) {
					hero.setHeroClass("Thief");
				} else if (confirmRaceOrClass == 4) {
					hero.setHeroClass("Warrior");
				} else if (confirmRaceOrClass == 5) {
					hero.setHeroClass("Wizard");
				}

				else {
					st.so("That is an invalid choice, please try again.");
				}
				if (confirmRaceOrClass < 1 || confirmRaceOrClass > 5) {
					System.out.println("this is an invalid option, please choose a number within the given range");
				} else {
					break;
				}
			} while (confirmRaceOrClass < 1 || confirmRaceOrClass > 5);

			st.stHalf("Okay, you have chosen " + hero.getHeroClass());
			st.stHalf("Is this correct?");

			confirm = kb.next();

			if (confirm.equalsIgnoreCase("yes")) {
				System.out.println("Okay, " + hero.getHeroClass() + " is your hero's class");
				break;
			}

		} while (confirm.equalsIgnoreCase("no"));

		System.out.println("Now to choose your hero's race");
		st.stHalf("Please choose from the following");
		heroRace.add("Human");
		heroRace.add("Orc");
		heroRace.add("Elf");
		heroRace.add("Dwarf");
		for (int i = 0; i < heroRace.size(); i++) {
			st.stHalf(i + 1 + ": " + heroRace.get(i));
		}

		do {
			do {
				confirmRaceOrClass = kb.nextInt();

				if (confirmRaceOrClass == 1) {
					hero.setHeroRace("Human");
				} else if (confirmRaceOrClass == 2) {
					hero.setHeroRace("Orc");
				} else if (confirmRaceOrClass == 3) {
					hero.setHeroRace("Elf");
				} else if (confirmRaceOrClass == 4) {
					hero.setHeroRace("Dwarf");
				} else {
					st.so(confirmRaceOrClass + " is not a valid choice");
				}
			} while (confirmRaceOrClass < 1 || confirmRaceOrClass > 5);

			st.so("You have chosen " + hero.getHeroRace() + ". Is this correct?");

			confirm = kb.next();
			if (confirm.equalsIgnoreCase("yes")) {
				System.out.println("Okay, you are now a " + hero.getHeroRace() + " " + hero.getHeroClass());
				break;
			}
		} while (confirm.equalsIgnoreCase("no"));

		System.out.println();

		st.stHalf("Let's roll for your character stats now");

		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			sum = r.nextInt(20 - 9) + 9;
			heroStats.add(sum);
		}
		Collections.sort(heroStats);
		Collections.reverse(heroStats);
		for (int i = 0; i < heroStats.size(); i++) {
			st.stHalf(i + 1 + ": " + heroStats.get(i));
		}

		st.stHalf(
				"So, since you are a " + hero.getHeroRace() + " " + hero.getHeroClass() + ". Here are my suggestions");
		String requestForAssistance = kb.nextLine();
		if (requestForAssistance.equalsIgnoreCase("yes")) {
			System.out.println("Give me a moment...");
		} else if (requestForAssistance.equalsIgnoreCase("no")) {
			System.out.println("Tough shit, Imma do this anyways");
		}

		if (hero.getHeroClass().equals("Warrior")) {

			hero.setstrength(heroStats.get(0));
			heroStats.remove(0);

			hero.setDexterity(heroStats.get(0));
			heroStats.remove(0);

			hero.setCharisma(heroStats.get(0));
			heroStats.remove(0);

			hero.setWisdom(heroStats.get(0));
			heroStats.remove(0);

			hero.setIntelligence(heroStats.get(0));
			heroStats.remove(0);

			System.out.println("Here is what I reccommend. ");
			st.stHalf("Strength: " + hero.getstrength());
			st.stHalf("Dexterity: " + hero.getDexterity());
			st.stHalf("Charisma: " + hero.getCharisma());
			st.stHalf("Wisdom: " + hero.getWisdom());
			st.stHalf("Intelligence: " + hero.getIntelligence());
		}
		
		if(hero.getHeroClass().equalsIgnoreCase("Cleric")){

			hero.setstrength(heroStats.get(0));
			heroStats.remove(0);

			hero.setDexterity(heroStats.get(0));
			heroStats.remove(0);

			hero.setCharisma(heroStats.get(0));
			heroStats.remove(0);

			hero.setWisdom(heroStats.get(0));
			heroStats.remove(0);

			hero.setIntelligence(heroStats.get(0));
			heroStats.remove(0);

			System.out.println("Here is what I reccommend. ");
			st.stHalf("Strength: " + hero.getstrength());
			st.stHalf("Dexterity: " + hero.getDexterity());
			st.stHalf("Charisma: " + hero.getCharisma());
			st.stHalf("Wisdom: " + hero.getWisdom());
			st.stHalf("Intelligence: " + hero.getIntelligence());
		}
		
		if(hero.getHeroClass().equalsIgnoreCase("Paladin")){

			hero.setstrength(heroStats.get(0));
			heroStats.remove(0);

			hero.setDexterity(heroStats.get(0));
			heroStats.remove(0);

			hero.setCharisma(heroStats.get(0));
			heroStats.remove(0);

			hero.setWisdom(heroStats.get(0));
			heroStats.remove(0);

			hero.setIntelligence(heroStats.get(0));
			heroStats.remove(0);

			System.out.println("Here is what I reccommend. ");
			st.stHalf("Strength: " + hero.getstrength());
			st.stHalf("Dexterity: " + hero.getDexterity());
			st.stHalf("Charisma: " + hero.getCharisma());
			st.stHalf("Wisdom: " + hero.getWisdom());
			st.stHalf("Intelligence: " + hero.getIntelligence());
		}
		
		if(hero.getHeroClass().equalsIgnoreCase("Thief")){

			hero.setstrength(heroStats.get(0));
			heroStats.remove(0);

			hero.setDexterity(heroStats.get(0));
			heroStats.remove(0);

			hero.setCharisma(heroStats.get(0));
			heroStats.remove(0);

			hero.setWisdom(heroStats.get(0));
			heroStats.remove(0);

			hero.setIntelligence(heroStats.get(0));
			heroStats.remove(0);

			System.out.println("Here is what I reccommend. ");
			st.stHalf("Strength: " + hero.getstrength());
			st.stHalf("Dexterity: " + hero.getDexterity());
			st.stHalf("Charisma: " + hero.getCharisma());
			st.stHalf("Wisdom: " + hero.getWisdom());
			st.stHalf("Intelligence: " + hero.getIntelligence());
		}
		
		if(hero.getHeroClass().equalsIgnoreCase("Wizard")){

			hero.setstrength(heroStats.get(0));
			heroStats.remove(0);

			hero.setDexterity(heroStats.get(0));
			heroStats.remove(0);

			hero.setCharisma(heroStats.get(0));
			heroStats.remove(0);

			hero.setWisdom(heroStats.get(0));
			heroStats.remove(0);

			hero.setIntelligence(heroStats.get(0));
			heroStats.remove(0);

			System.out.println("Here is what I reccommend. ");
			st.stHalf("Strength: " + hero.getstrength());
			st.stHalf("Dexterity: " + hero.getDexterity());
			st.stHalf("Charisma: " + hero.getCharisma());
			st.stHalf("Wisdom: " + hero.getWisdom());
			st.stHalf("Intelligence: " + hero.getIntelligence());
		}
		
		
		System.out.println();
		System.out.println("Does this look good to you?");
		String looksGoodToYou = kb.nextLine();

		if (looksGoodToYou.equalsIgnoreCase("Yes")) {
			System.out.println();
			System.out.println("Great! Off we go!");

			kb.close();
			int health = r.nextInt(50 - 20) + 20;
			hero.setHealth(health);

			MainVillage.startingVillage(hero);
		} else if (looksGoodToYou.equalsIgnoreCase("no")) {
			System.out.println("Tough shit, we're going in anyways!!! WOOOOOOOO!");

			kb.close();
			int health = r.nextInt(50 - 20) + 20;
			hero.setHealth(health);

			MainVillage.startingVillage(hero);
		}

	}
}
