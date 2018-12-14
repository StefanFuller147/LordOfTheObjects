package playerCharacter;

import java.util.Scanner;

import globalShit.SleepyThread;

public class CreateYourHero {
	static Scanner kb = new Scanner(System.in);
	static HeroTemplate hero = new HeroTemplate();
	static SleepyThread st = new SleepyThread();
	static String confirm;

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
		
		
	}
}
