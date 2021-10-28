package com.company.javaStuffs.collectionExamples.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	String firstName;
	transient String middleName;
	String lastName;

	public Employee(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	void validateName()  {
		if(firstName.length()>7)
			throw new StringIndexOutOfBoundsException("worng name length");
	}

	@Override
	public String toString() {
		return ("Employee first name "+firstName+"\n Last name "+lastName);
	}
}
