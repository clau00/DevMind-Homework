package ExercitiiMostenire;

public class Rhino extends Terrestrial{

	public Rhino(boolean carnivore, int weight, int size, String species, int legs, int eyes) {
		super(carnivore, weight, size, species, legs, eyes);
	}
	
	@Override
	public void saySomething() {
		System.out.println("\t Rhinoooooooo.....");
		//super.saySomething();
	}
	
	public void rhi() {
		System.out.println("\t Rhino rhiiiii");
	}
}
