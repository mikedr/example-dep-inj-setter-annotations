package org.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myPerson")
public class Person {

	Sportist mySport;

	public Person() {
	}
	
	@Autowired
	public void setMySport(Sportist mySport) {
		this.mySport = mySport;
	}

	public String doSport() {
		return mySport.playSport();
	}
}

