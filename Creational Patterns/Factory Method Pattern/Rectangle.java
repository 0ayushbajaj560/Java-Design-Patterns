public class Rectangle extends Shape{

	public Rectangle() {
	
	}
	
	public Rectangle(int length,int breadth) {
		setLength(length);
		setBreadth(breadth);
	}
	
	@Override
	public double calculateArea() {
		return super.getLength() * super.getBreadth();
	}

	
}

