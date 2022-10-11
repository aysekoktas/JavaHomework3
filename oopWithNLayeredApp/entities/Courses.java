 package oopWithNLayeredApp.entities;

public class Courses {
	private String name;
	private int id;
	private double price;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Courses(String name, int id, double price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}

}
