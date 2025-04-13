package creationalPatterns;

public class PersonDto {

	final private long aadharNumber;
	final private long phone;
	final private String name;
	final private float age;

	private PersonDto(PersonBuilder personObj) {
		this.aadharNumber = personObj.aadharNumber;
		this.phone = personObj.phone;
		this.name = personObj.name;
		this.age = personObj.age;
	}

	@Override
	public String toString() {
		return "AadharNumber : " + aadharNumber + "," + "Phone Number : " + phone + "," + "Person Name : " + name + ","
				+ "Person Age  : " + age;
	}

	public static final class PersonBuilder {

		private final long aadharNumber;
		private final long phone;
		private final String name;
		private float age;

		public PersonBuilder(long aadharNumber, long phone, String name) {
			if (aadharNumber == 0 && phone == 0 && name.isBlank())
				throw new IllegalArgumentException("Fileds should not be null or blank");

			this.aadharNumber = aadharNumber;
			this.phone = phone;
			this.name = name;
		}

		public PersonBuilder setAge(float age) {
			if (age < 0)
				throw new IllegalArgumentException("Age should be grater than 0");

			this.age = age;
			return this;
		}

		public PersonDto build() {
			return new PersonDto(this);
		}

	}
}
