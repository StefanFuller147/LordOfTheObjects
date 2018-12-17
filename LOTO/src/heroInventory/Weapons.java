package heroInventory;

public class Weapons {
	private String name;
	private int price;
	private int weight;
	private int damage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public Weapons(String name, int price, int weight, int damage) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.damage = damage;
	}
	public Weapons() {
		super();
		// TODO Auto-generated constructor stub
	}
}
