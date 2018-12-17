package playerCharacter;

import java.util.ArrayList;

import heroInventory.InventoryItems;

public class HeroTemplate {
	private int strength;
	private int health;
	private int intelligence;
	private int wisdom;
	private int dexterity;
	private int charisma;
	
	private String name;
	private String heroClass;
	private String heroRace;
	
	private ArrayList <InventoryItems> inventory = new ArrayList<>();
	
	public int getstrength() {
		return strength;
	}
	public void setstrength(int strength) {
		this.strength = strength;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public ArrayList<InventoryItems> getInventory() {
		return inventory;
	}
	public void setInventory(ArrayList<InventoryItems> inventory) {
		this.inventory = inventory;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getWisdom() {
		return wisdom;
	}
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public int getCharisma() {
		return charisma;
	}
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeroClass() {
		return heroClass;
	}
	public void setHeroClass(String heroClass) {
		this.heroClass = heroClass;
	}
	public String getHeroRace() {
		return heroRace;
	}
	public void setHeroRace(String heroRace) {
		this.heroRace = heroRace;
	}
	@Override
	public String toString() {
		return "HeroTemplate [strength=" + strength + ", health=" + health + ", intelligence=" + intelligence
				+ ", wisdom=" + wisdom + ", dexterity=" + dexterity + ", charisma=" + charisma + ", name=" + name
				+ ", heroClass=" + heroClass + ", heroRace=" + heroRace + ", inventory=" + inventory + "]";
	}
	public HeroTemplate(int strength, int health, int intelligence, int wisdom, int dexterity, int charisma,
			String name, String heroClass, String heroRace, ArrayList<InventoryItems> inventory) {
		super();
		this.strength = strength;
		this.health = health;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.dexterity = dexterity;
		this.charisma = charisma;
		this.name = name;
		this.heroClass = heroClass;
		this.heroRace = heroRace;
		this.inventory = inventory;
	}
	public HeroTemplate() {
		super();
	}
	
	
}
