package it.unibo.lambdas.first;

public class Person {
	private final String name;
	private final int yearOfBirth;
	private final boolean married;

	public Person(final String name, final int yearOfBirth, final boolean married){
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.married = married;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return yearOfBirth;
	}

	public boolean isMarried() {
		return married;
	}

	public String toString(){
		return this.name + ":" + this.yearOfBirth + ":" +
				(this.married ? "spos" : "non-spos");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + yearOfBirth;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (married ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		var other = (Person) obj;
		if (yearOfBirth != other.yearOfBirth)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (married != other.married)
			return false;
		return true;
	}
}