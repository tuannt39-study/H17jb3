package nothing;

public class Circle {
	private double radius;
	protected double area;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return area=Math.PI*2*this.radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ban kinh: "+this.radius+", dien tich: "+getArea();
	}

}
