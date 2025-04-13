package creationalPatterns;

import java.util.List;

public class AadharCardService {

	AadharCardSingletonPattern aadhar = AadharCardSingletonPattern.getInstance();

	public void addMember(PersonDto p) {

		aadhar.getAadharMembers().add(p);
		System.out.println("Account created successfully");

	}

	public void getAllAadharMembers() {
		List<PersonDto> memberList = aadhar.getAadharMembers();

		System.out.println(memberList);
	}
}
