package JavaGenerics;

public class AquariumManager {

	public static void main(String[] args) {
		Shark shark = new Shark("Shark");
		Dolphin dolphin = new Dolphin("Dolphin");
		Tuna tuna = new Tuna("Tuna");
		
		Aquarium<Shark> aquarium1 = new Aquarium("Deep oceans blue");
		aquarium1.addFish(shark);
		aquarium1.addFish(new Shark("Shhaarrkkk"));
		// aquarium1.addFish(dolphin);
		// aquarium1.addFish(tuna);
		
		//Aquarium<Integer> numbers = new Aquarium("Numbers");
		//numbers.addFish(1);
		
		System.out.println(aquarium1.numberOfFishes());
	}
}
