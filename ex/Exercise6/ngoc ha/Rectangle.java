package nothing;

public class Rectangle extends Shape {
	private int height;
	private int width;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	protected void drawHeight() {
		for (int i = 0; i < this.height; i++) {
			if (i == this.height - 1) {
				System.out.println(getSt());
			} else
				System.out.print(getSt());
		}
	}

	protected void drawWidth() {
		for (int i = 0; i < this.width - 2; i++) {
			System.out.print(getSt());
			for (int j = 0; j < this.height - 2; j++) {
				System.out.print(" ");
			}
			System.out.println(getSt());
		}
	}

	@Override
	public void draw() {
		drawHeight();
		drawWidth();
		drawHeight();
	}
	
	public Rectangle() {
		super();
	}

	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
//
//	public static void main(String[] args) {
//		new Rectangle(10, 5).draw();;
//		
//	}

}
