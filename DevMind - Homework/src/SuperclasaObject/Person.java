package SuperclasaObject;

public class Person extends Being{

	private String nume;
	private String prenume;
	private int varsta;
	private int numarDeOrdine;
	
	public Person(String species, String nume, String prenume, int varsta, int numarDeOrdine) {
		super(species);
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.numarDeOrdine = numarDeOrdine;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Person personObj = (Person) obj;
		if(super.equals(personObj) && 
				this.nume.equals(personObj.nume) &&
				this.prenume.equals(personObj.prenume) &&
				this.varsta == personObj.varsta) {
			return true;
		}
		
		return false;
	}
}
