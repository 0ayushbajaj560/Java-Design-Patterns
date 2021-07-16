import java.util.Scanner;

public class ShapeFactory {

	public ShapeFactory() {

	}

	public Shape getShape(String shapeString) {
		Shape shape = null;

		if(shapeString == null ) {
			return null;
		}
		else if (shapeString.equalsIgnoreCase("SQUARE")) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter length");
			int length = scanner.nextInt();
			
			return new Square(length);
		}
		else if (shapeString.equalsIgnoreCase("Rectangle")) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter length");
			int length = scanner.nextInt();
			
			System.out.println("Enter Breadth");
			int breadth = scanner.nextInt();
			
			return new Rectangle(length,breadth);
		}
		else
			return null;
	}
}
