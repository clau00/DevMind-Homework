package JavaGenerics;

public class Shark extends AquaticAnimal{

	public Shark(String name) {
		super(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
	return super.equals(obj);
	}
}
