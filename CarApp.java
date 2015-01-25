 
 public class CarApp {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setPrice(10000);
		car1.setColor("blue");
		car1.setCurrency("JPY");
		car1.setWeight(1200);
		
		double p = car1.getPrice();
		String co = car1.getColor();
		String cu = car1.getCurrency();
		double w = car1.getWeight();
		
		System.out.println("Price = " + p + cu);
		System.out.println("Color = " + co);
		System.out.println("Weight = "+ w);
		
		System.out.println(car1.drive());
	}
	
 }