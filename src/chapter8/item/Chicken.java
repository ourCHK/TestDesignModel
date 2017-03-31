package chapter8.item;

public class Chicken implements Comparable<Chicken>{

	String name;
	int weight;
	public Chicken(String name,int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String toString() {
		return name + " weight:" + weight;
	}

	@Override
	public int compareTo(Chicken arg0) {
		// TODO Auto-generated method stub
		Chicken otherChicken = (Chicken) arg0;
		if(this.weight < otherChicken.weight) {
			return -1;
		} else if (this.weight == otherChicken.weight) {
			return 0;
		} else {
			return 1;
		} 
	}

}
