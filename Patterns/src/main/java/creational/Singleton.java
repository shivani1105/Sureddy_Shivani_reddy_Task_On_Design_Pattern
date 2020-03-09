package creational;

public final class Singleton {
	
	private static final Singleton singleton=new Singleton();

	   private Singleton(){
	      System.out.println("object created...");
	   }

	   public static Singleton getInstance(){
	      return singleton;
	   }

}
