package heroInventory;

public class Potions {
	private String name;
	private int price;
	private int weight;
	private int type;
	
	
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Potions(String name, int price, int weight, int type) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.type = type;
	}
	public Potions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
