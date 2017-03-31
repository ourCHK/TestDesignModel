package chapter9_part2.item;

public class MenuItem extends MenuComponent {
	String name;
	String description;
	boolean vegetarian;
	double price;
	
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public boolean isVegetarian() {
		// TODO Auto-generated method stub
		return vegetarian;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(" "+getName());
		if (isVegetarian())
			System.out.print("(v)");
		System.out.println(","+getPrice());
		System.out.println("---"+getDescription());
	}
	
	
}
