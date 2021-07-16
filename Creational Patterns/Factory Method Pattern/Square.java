
public class Square extends Shape{

	public Square() {
	
	}
	
	public Square(int length) {
		setLength(length);
		setBreadth(length);
	}
	
	@Override
	public double calculateArea() {
		return super.getLength() * super.getLength();
	}

	
}
