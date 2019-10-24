package SuperclasaObject;

public class TestEquals {
	
	public static void main(String[] args) {
		
		Being b = new Being("species");
		Person p = new Person("spec", "as", "gr", 12, 23);
		
		System.out.println(p);
		
		b=p;
		System.out.println(b);
	}
}
