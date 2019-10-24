package JavaGenerics;

public abstract class AquaticAnimal {
	private String name;
	
	public AquaticAnimal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + ((this.name == null) ? 0 : this.name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof AquaticAnimal)){
			return false;
		}
		AquaticAnimal other = (AquaticAnimal) obj;
		if(this.name == null) {
			if(other.name != null) {
				return false;
			}
		}else if(!this.name.equals(other.name)) {
			return false;
		}
		return true;
	}
}
