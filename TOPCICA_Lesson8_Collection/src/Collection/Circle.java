package Collection;

import java.util.Random;

public class Circle implements Comparable<Circle> {

	private int radius;

	public Circle() {
		Random rd = new Random();
		this.radius = 0;
		while (radius == 0) {
			this.radius = rd.nextInt(100);
		}
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public int compareTo(Circle circle) {
		return (this.radius - circle.radius);
	}
}
