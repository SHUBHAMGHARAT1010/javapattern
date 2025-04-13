package creationalPatterns;

public class AadharCardMain {

	// main
	public static void main(String[] args) {

		AadharCardService service = new AadharCardService();

		service.addMember(new PersonDto.PersonBuilder(746576457865365L, 8766843042L, "Shubham Gharat").setAge(25.1F).build());

		service.addMember(new PersonDto.PersonBuilder(36593459754535755L, 9588688054L, "Vikki").setAge(27.5F).build());


		service.getAllAadharMembers();
	}
}
