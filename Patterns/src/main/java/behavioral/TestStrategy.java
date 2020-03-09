package behavioral;

public class TestStrategy {
	
	
	public static void main(String[] args) {
	      Man s1 = new Man(new CalmMode(), "Pikeman");
	      Man s2 = new Man(new FrustrationMode(), "Militia");
	      Man s3 = new Man(new CalmMode(), "Saransh");
	      s1.stance();
	      s2.stance();
	      s3.stance();
	   }
	

}
