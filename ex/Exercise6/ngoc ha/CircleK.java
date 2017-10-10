package nothing;

import java.text.DecimalFormat;

public class CircleK extends Point {
	private double radius;

	protected DecimalFormat format = new DecimalFormat("0.00");
	public CircleK() {
	}

	public CircleK(int x, int y, double radius) {
		super.x = x;
		super.y = y;
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getDiameter() {
		return format.format( radius * 2);
	}

	public String getCircumference() {
		return format.format(radius * 2 * Math.PI);
	}

	public String getArea() {
		return format.format( radius * radius * Math.PI);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" d="+getDiameter()+"; C="+getCircumference()+"; S="+getArea();
	}
}
