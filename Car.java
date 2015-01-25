
public class Car {
	//price attribute
	private double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double p) {
		price = p;
	}
	
	//color attribute
	private String color;
	public String getColor() {
		return color;
	}
	public void setColor(String co) {
		color = co;
	}

	//weight attribute
	private double weight;
	public double getWeight() {
		return weight;
	}
	public void setWeight(double w) {
		weight = w;
	}
	
	//currency attribute
	private String currency;
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String cu) {
		currency = cu;
	}
	
	//drive your new car!
	public String drive() {
		return "I'm driving a " + this.getWeight() + "kg " + this.getColor() + " car that costs " + this.getPrice() + this.getCurrency();
		}
	
}