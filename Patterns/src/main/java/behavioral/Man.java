package behavioral;

public class Man {
	
	private ManBehavior behavior;
	   private String type;

	   public Man(ManBehavior behavior, String type) {
	      super();
	      this.behavior = behavior;
	      this.type = type;
	   }

	   public void stance() {
	      System.out.println(type);
	      behavior.stance();
	   }

}
