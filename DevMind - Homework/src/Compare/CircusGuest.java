package Compare;

public class CircusGuest implements Comparable<CircusGuest> {

	private String name;
	private int place;
	private int age;
	
	public CircusGuest(String name, int place, int age) {
		this.name = name;
		this.place = place;
		this.age = age;
	}
	
	public int getPlace() {
		return this.place;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public int compareTo(CircusGuest obj) {
		return this.age-obj.age;
	}
}
