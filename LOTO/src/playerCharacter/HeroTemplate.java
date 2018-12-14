package playerCharacter;

public class HeroTemplate {
	private int strenght;
	private int health;
	private int intelligence;
	private int wisdom;
	private int dexterity;
	private int charisma;
	
	private String name;
	private String heroClass;
	private String heroRace;
	public int getStrenght() {
		return strenght;
	}
	public void setStrenght(int strenght) {
		this.strenght = strenght;
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
		return "HeroCreation [strenght=" + strenght + ", health=" + health + ", intelligence=" + intelligence
				+ ", wisdom=" + wisdom + ", dexterity=" + dexterity + ", charisma=" + charisma + ", name=" + name
				+ ", heroClass=" + heroClass + ", heroRace=" + heroRace + "]";
	}
	public HeroTemplate(int strenght, int health, int intelligence, int wisdom, int dexterity, int charisma,
			String name, String heroClass, String heroRace) {
		super();
		this.strenght = strenght;
		this.health = health;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.dexterity = dexterity;
		this.charisma = charisma;
		this.name = name;
		this.heroClass = heroClass;
		this.heroRace = heroRace;
	}
	public HeroTemplate() {
		super();
	}
	
	
}
