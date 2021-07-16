
public class App {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape = factory.getShape("SquarE");
		System.out.println(shape.calculateArea());
		
		shape = factory.getShape("ReCtanGle");
		System.out.println(shape.calculateArea());
	}
}
