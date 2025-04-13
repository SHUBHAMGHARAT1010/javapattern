package creationalPatterns;

public class PersonDto {

	private long aadharnumber;
	private long phone;
	private String name;
	private float age;

	public PersonDto() {
		// TODO Auto-generated constructor stub
	}

	public PersonDto(long aadharnumber, long phone, String name, float age) {
		this.aadharnumber = aadharnumber;
		this.phone = phone;
		this.name = name;
		this.age = age;
	}
}
