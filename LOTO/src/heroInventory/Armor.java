package heroInventory;

public class Armor {
	private String name;
	private int price;
	private int weight;
	private int protection;
	
	
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
	public int getProtection() {
		return protection;
	}
	public void setProtection(int protection) {
		this.protection = protection;
	}
	public Armor(String name, int price, int weight, int protection) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.protection = protection;
	}
	public Armor() {
		super();
		// TODO Auto-generated constructor stub
	} 
}
