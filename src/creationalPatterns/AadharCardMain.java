package creationalPatterns;

public class AadharCardMain {

	// main
	public static void main(String[] args) {
		AadharCardSingletonPattern aadhar = AadharCardSingletonPattern.getInstance();

		aadhar.addMember(new PersonDto(100001l, 8766843042l, "Shubham Gharat", 25.6f));
		aadhar.addMember(new PersonDto(100002l, 9881819916l, "Krushna Shendge", 25.7f));

		AadharCardSingletonPattern otherInst = AadharCardSingletonPattern.getInstance();
		System.out.println(aadhar == otherInst);

	}
}
