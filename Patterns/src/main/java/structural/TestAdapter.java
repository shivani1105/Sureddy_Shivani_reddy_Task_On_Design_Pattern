package structural;

public class TestAdapter {
	
	
	public static void main(String args[]) 
    { 
        Sparrow sparrow = new Sparrow(); 
        Duck toyDuck = new ToyDuck(); 
  
        // Wrap a bird in a birdAdapter so that it  
        // behaves like toy duck 
        Duck birdAdapter = new BirdAdapter(sparrow); 
  
        System.out.println("Sparrow..."); 
        sparrow.fly(); 
        sparrow.makeSound(); 
  
        System.out.println("ToyDuck..."); 
        toyDuck.squeak(); 
  
        // toy duck behaving like a bird  
        System.out.println("BirdAdapter..."); 
        birdAdapter.squeak(); 
    } 

}
