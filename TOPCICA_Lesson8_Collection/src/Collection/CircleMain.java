package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CircleMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {


		List<Circle> listCircle = new ArrayList<Circle>();
		for (int i = 0; i < 100; i++) {
			Circle cr = new Circle();
			listCircle.add(cr);
		}
		
		Collections.sort(listCircle);
		
		for (Circle circle : listCircle) {
			System.out.println(circle.getRadius());
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("-----Enter the number: " + "\t");
		double number = sc.nextDouble();
		double rad = Math.sqrt(number / Math.PI);

		double min = Math.abs(listCircle.get(0).getRadius() - rad);
		int index = 0;

		for (int i = 1; i < listCircle.size(); i++) {
			if (min > Math.abs(listCircle.get(i).getRadius() - rad)) {

				min = Math.abs(listCircle.get(i).getRadius() - rad);
				index = i;
			}
		}
		System.out.println("Index= " + index);
		
		
	}

}
