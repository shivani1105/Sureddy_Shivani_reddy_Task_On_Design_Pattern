package structural;

public class BirdAdapter implements Duck {
	
	
	Bird bird; 
    public BirdAdapter(Bird bird) 
    { 
        // we need reference to the object we 
        // are adapting 
        this.bird = bird; 
    }

	public void squeak() {
		// TODO Auto-generated method stub
		bird.makeSound(); 

	}

}
