package ExercitiiMostenire;

public class Zebra extends Terrestrial {
	
	private boolean hasStripes;

	public Zebra(boolean carnivore, int weight, int size, String species, int legs, int eyes) {
		super(carnivore, weight, size, species, legs, eyes);
	}
	
	@Override
	public void description() {
		System.out.println("\t The ZEBRA animal " + (this.hasStripes ? "has" : "does not have") + " stripes.\n");
		//super.description();
	}
	
	@Override
	public void saySomething() {
		System.out.println("\t Zebraaaaaaa.....");
		//super.saySomething();
	}
	
	public void mooo() {
		System.out.println("\t ZEBRA mooooooo");
	}
}

