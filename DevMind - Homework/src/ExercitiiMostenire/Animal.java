package ExercitiiMostenire;

public class Animal {

	private boolean carnivore;
	private int weight;
	private int size;
	private String species;
	
	public Animal(boolean carnivore, int weight, int size, String species) {
		this.carnivore = carnivore;
		this.weight = weight;
		this.size = size;
		this.species = species;
	}
	
	public void eat(int unitsFood) {
		System.out.println("\t This ANIMAL eats " + unitsFood + " units of food. \n");
	}
	
	public void move(int distance) {
		System.out.println("\t This ANIMAL moves " + distance + " meters \n");
	}
	
	public void description() {
		System.out.println("\t This ANIMAL is a " + this.species + " species; has a size of "
						 + this.size + " meters; weighs " + this.weight + " kilos and is "
						 + (this.carnivore ? "" : "not") + " a carnivore \n");
	}
	
	public void saySomething() {
		System.out.println("\t ANIMALlllll...");
	}
}
