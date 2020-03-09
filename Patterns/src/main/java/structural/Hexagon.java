package structural;

public class Hexagon extends Shape {
	
	public Hexagon(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.print("Hexagon filled with color ");
		color.applyColor();

	}

}