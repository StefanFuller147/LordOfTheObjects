package playerCharacter;

import java.util.ArrayList;
import java.util.Scanner;

import globalShit.SleepyThread;

public class CreateYourHero {
	static Scanner kb = new Scanner(System.in);
	static HeroTemplate hero = new HeroTemplate();
	static SleepyThread st = new SleepyThread();
	static String confirm;
	static int confirmRaceOrClass;
	static ArrayList<String> heroClass = new ArrayList<>();
	static ArrayList<String> heroRace = new ArrayList<>();

	public static void main(String[] args) {

		st.st1("Welcome to character creation! Please input your characters name");
		String heroName = kb.nextLine();
		st.st1(heroName + ", is that the name you'd like to give your hero?");
		do {
			confirm = kb.nextLine();

			if (confirm.equalsIgnoreCase("yes")) {
				hero.setName(heroName);
				System.out.println("Okay, " + hero.getName() + " is your heros new name");
				break;
			} else if (confirm.equalsIgnoreCase("no")) {
				st.st1("Okay, what would you like your characters name to be then?");
				st.st1("Re-Enter your heros name");
			}
			if (!confirm.equalsIgnoreCase("yes") || !confirm.equalsIgnoreCase("no")) {
				st.st1(confirm + " is not a valid answer, please answer yes or no.");
				System.out.println();
				st.st1(heroName + " is that the name you'd like to give your hero?");
			}
		} while (confirm.equalsIgnoreCase("no"));

		st.so("Now, we need to create select your hero's class");
		st.st1("Please select one of the following from the list");
		heroClass.add("Cleric");
		heroClass.add("Paladin");
		heroClass.add("Thief");
		heroClass.add("Warrior");
		heroClass.add("Wizard");

		for (int i = 0; i < heroClass.size(); i++) {
			st.st1(i + 1 + ": " + heroClass.get(i));
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

			st.st1("Okay, you have chosen " + hero.getHeroClass());
			st.st1("Is this correct?");

			confirm = kb.next();

			if (confirm.equalsIgnoreCase("yes")) {
				System.out.println("Okay, " + hero.getHeroClass() + " is your hero's class");
				break;
			}

		} while (confirm.equalsIgnoreCase("no"));

		System.out.println("Now to choose your hero's race");
		st.st1("Please choose from the following");
		heroRace.add("Human");
		heroRace.add("Orc");
		heroRace.add("Elf");
		heroRace.add("Dwarf");
		for (int i = 0; i < heroRace.size(); i++)
			st.st1(i + 1 + ": " + heroRace.get(i));
	}

}
