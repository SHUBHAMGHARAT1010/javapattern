package creationalPatterns;

import java.util.ArrayList;
import java.util.List;

public class AadharCardSingletonPattern {

	// Static instance of AadharCardSingletonPattern to implement the Singleton.

	private static AadharCardSingletonPattern aadharInstance;
	// List to hold members of the Aadhar card.

	private List<PersonDto> aadharMembers = new ArrayList<PersonDto>();
	// Private constructor to prevent instantiation from outside the class

	private AadharCardSingletonPattern() {

		// Check if the instance is already created to prevent instantiation

		if (aadharInstance != null)
			throw new IllegalStateException("Aadhaar Card instance alraedy createed !!!");
	}
	// Public static method to provide access to the Singleton instance

	public static AadharCardSingletonPattern getInstance() {

		// Return the existing instance if it is already created

		if (aadharInstance != null)
			return aadharInstance;
		// Synchronize the block to ensure thread-safety when creating the instance

		synchronized (AadharCardSingletonPattern.class) {

			// re-check to avoid creating multiple instances in a multi-threaded environment

			if (aadharInstance == null) {
				aadharInstance = new AadharCardSingletonPattern();
			}

		}
		return aadharInstance;
	}
	// Method to add a new member to the Aadhar card list

	public List<PersonDto> getAadharMembers() {
		return aadharMembers;
	}

	public void setAadharMembers(List<PersonDto> aadharMembers) {
		this.aadharMembers = aadharMembers;
	}

//	public void addMember(PersonDto p) {
//		aadharMembers.add(p);
//		System.out.println("Account created successfully");
//	}

	
}
