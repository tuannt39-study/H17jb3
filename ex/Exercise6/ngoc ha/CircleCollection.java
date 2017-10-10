package nothing;

import java.util.ArrayList;
import java.util.function.Consumer;

public class CircleCollection extends ArrayList<Circle> {

	public ArrayList<Circle> getArrayList() {
		return arrayList;
	}

	ArrayList<Circle> arrayList = new ArrayList<>();

	public CircleCollection(ArrayList<Circle> arrayList) {
		super();
		this.arrayList = arrayList;
	}

	public CircleCollection() {
		super();
	}

	public void addCircle(Circle c) {
		arrayList.add(c);
	}

	public int getSize() {
		return arrayList.size();
	}

	public Circle getCircle(int pos) {
		return arrayList.get(pos);
	}

	public void setCircle(int pos, Circle c) {
		arrayList.remove(pos);
		arrayList.add(pos, c);
	}

	@Override
	public String toString() {
		return "Tong dien tich: " + totalArea() + "\nDien tich lon nhat: " + maxArea()
				+ "\nHinh tron co dien tich nho nhat: " + minArea() + ": " + minCircle().toString();
	}

	public double totalArea() {
		double t = 0;
		for (Circle c : arrayList) {
			t += c.getArea();
		}
		return t;
	}

	public double maxArea() {
		double max = 0;
		for (Circle c : arrayList) {
			if (max < c.getArea()) {
				max = c.getArea();
			}
		}
		return max;
	}

	protected double minArea() {
		double min = 1000000000;
		for (Circle c : arrayList) {
			if (min > c.getArea()) {
				min = c.getArea();
			}
		}
		return min;
	}

	public Circle minCircle() {
		Circle cc= new Circle();
		for (Circle c : arrayList) {
			if (c.getArea() == minArea()) {
				cc=c;
			}
		}
		return cc;
	}
}
