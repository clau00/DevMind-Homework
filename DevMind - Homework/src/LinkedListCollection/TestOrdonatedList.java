package LinkedListCollection;

public class TestOrdonatedList {

	public static void main(String[] args) {
		
		OrdonatedList<Town> towns = new OrdonatedList<>();
		
		towns.addELement(new Town("Covasna", 100));
		towns.addELement(new Town("Timisoara", 250));
		towns.addELement(new Town("Oradea", 250));
		towns.addELement(new Town("Bucuresti", 100));
		towns.addELement(new Town("Targoviste", 25));
		
		System.out.println(towns);
	}
}
