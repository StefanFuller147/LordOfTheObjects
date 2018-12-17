package stores;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import globalShit.SleepyThread;
import heroInventory.Weapons;
import mainStory.MainVillage;
import playerCharacter.HeroTemplate;

public class Armory {
	static SleepyThread st = new SleepyThread();
	static Scanner kb = new Scanner(System.in);
	static Random r = new Random();

	static int axeDam = r.nextInt(8 - 4) + 4;
	static int swordDam = r.nextInt(12 - 1) + 1;
	static int daggerDam = r.nextInt(3 - 2) + 2;
	static int bowAndArrowDam = r.nextInt(4 - 2) + 2;
	static int staffDam = r.nextInt(6 - 2) + 2;
	static int morningStarDam = r.nextInt(10 - 4) + 4;

	static Weapons axe = new Weapons("Axe", 10, 5, axeDam);
	static Weapons sword = new Weapons("Sword", 15, 10, swordDam);
	static Weapons dagger = new Weapons("Dagger", 5, 2, daggerDam);
	static Weapons bowAndArrow = new Weapons("Bow & Arrow", 20, 4, bowAndArrowDam);
	static Weapons staff = new Weapons("Staff", 8, 5, staffDam);
	static Weapons morningStar = new Weapons("Morning Star", 20, 6, morningStarDam);

	static private ArrayList<Weapons> armoryWeaponsInventory = new ArrayList<>();

	static int goBackToTown;

	public static void armoryShit(HeroTemplate hero) {
		System.out.println("Alright, the Armorer is this way");
		st.stHalf("The Crier whisks you away to the Armorer");
		System.out.println();
		System.out.println();

		armoryWeaponsInventory.add(axe);
		armoryWeaponsInventory.add(sword);
		armoryWeaponsInventory.add(dagger);
		armoryWeaponsInventory.add(bowAndArrow);
		armoryWeaponsInventory.add(staff);
		armoryWeaponsInventory.add(morningStar);

		st.stHalf("Welcome to the Armory, I'm the blacksmith. Would you care to take a look at my wares?");
		String takeALookAtArmoryWares = kb.nextLine();

		if (takeALookAtArmoryWares.equalsIgnoreCase("yes")) {
			System.out.println("Alright, would you like to look at weapons or armor?");
			String armorOrWeapons = kb.nextLine();
			if (armorOrWeapons.equalsIgnoreCase("weapons")) {
				for (int i = 0; i < armoryWeaponsInventory.size(); i++) {
					System.out.println(i + 1 + ": " + armoryWeaponsInventory.get(i).getName());
				}
				System.out.println("Would you like to take a look at anything in particular?");
				int lookAtWeaponMoreCloselier = kb.nextInt();
				
				if(lookAtWeaponMoreCloselier == 1){
					System.out.println("Name: " +armoryWeaponsInventory.get(0).getName());
					System.out.println("Cost: " + armoryWeaponsInventory.get(0).getPrice());
					System.out.println("Damage: " + armoryWeaponsInventory.get(0).getDamage());
					System.out.println("Weight: " + armoryWeaponsInventory.get(0).getWeight());

				}
				if(lookAtWeaponMoreCloselier == 2){
					System.out.println("Name: " +armoryWeaponsInventory.get(1).getName());
					System.out.println("Cost: " + armoryWeaponsInventory.get(1).getPrice());
					System.out.println("Damage: " + armoryWeaponsInventory.get(1).getDamage());
					System.out.println("Weight: " + armoryWeaponsInventory.get(1).getWeight());

				}
				if(lookAtWeaponMoreCloselier == 3){
					System.out.println("Name: " +armoryWeaponsInventory.get(2).getName());
					System.out.println("Cost: " + armoryWeaponsInventory.get(2).getPrice());
					System.out.println("Damage: " + armoryWeaponsInventory.get(2).getDamage());
					System.out.println("Weight: " + armoryWeaponsInventory.get(2).getWeight());

				}if(lookAtWeaponMoreCloselier == 4){
					System.out.println("Name: " +armoryWeaponsInventory.get(3).getName());
					System.out.println("Cost: " + armoryWeaponsInventory.get(3).getPrice());
					System.out.println("Damage: " + armoryWeaponsInventory.get(3).getDamage());
					System.out.println("Weight: " + armoryWeaponsInventory.get(3).getWeight());

				}if(lookAtWeaponMoreCloselier == 5){
					System.out.println("Name: " +armoryWeaponsInventory.get(4).getName());
					System.out.println("Cost: " + armoryWeaponsInventory.get(4).getPrice());
					System.out.println("Damage: " + armoryWeaponsInventory.get(4).getDamage());
					System.out.println("Weight: " + armoryWeaponsInventory.get(4).getWeight());

				}if(lookAtWeaponMoreCloselier == 6){
					System.out.println("Name: " +armoryWeaponsInventory.get(5).getName());
					System.out.println("Cost: " + armoryWeaponsInventory.get(5).getPrice());
					System.out.println("Damage: " + armoryWeaponsInventory.get(5).getDamage());
					System.out.println("Weight: " + armoryWeaponsInventory.get(5).getWeight());

				}
			}
			if(armorOrWeapons.equals("armor")){
				//make armor objs and add to ArrayList
			}

		}

		else if (takeALookAtArmoryWares.equalsIgnoreCase("no")) {
			System.out.println("Alright, well if you change your mind I'll be here");
			MainVillage.whereToGoInTown(hero);
			kb.close();
		}
	}
}
