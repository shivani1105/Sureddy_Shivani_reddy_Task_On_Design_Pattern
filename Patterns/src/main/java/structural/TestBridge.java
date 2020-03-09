package structural;

public class TestBridge {

	
	public static void main(String[] args) {
		Shape sq = new Square(new BlueColor());
		sq.applyColor();
		
		Shape hex = new Hexagon(new YellowColor());
		hex.applyColor();
	}
	
}
