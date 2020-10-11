package Ex4;


public class Circle {
	private double radius = 1.0d;
	private String color = "Red";
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public Circle(double radius,String color){
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public double getArea(){
		return Math.PI*Math.pow(radius, 2);
	}
	
	public String toString(){
		return "r: " + radius + " color: " + color + " S: "+ getArea();
	}
}
