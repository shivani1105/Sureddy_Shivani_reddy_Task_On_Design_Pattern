package structural;

public class Square extends Shape {
	
	public Square(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.print("Square filled with color ");
		color.applyColor();

	}

}