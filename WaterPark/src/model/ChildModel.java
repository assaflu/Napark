package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ChildModel {
	public SimpleStringProperty name;
	public SimpleIntegerProperty ID;
	public SimpleIntegerProperty regularTickets;
	//TODO: list of extreme tickets
	public SimpleIntegerProperty height;
	public SimpleIntegerProperty age;
	//TODO: guardian
	public RideModel location;
	
	public ChildModel(String name, int height, int age, int ID)
	{
		//TODO: complete
	}

	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public int getID() {
		return ID.get();
	}

	public void setID(int ID) {
		this.ID.set(ID);
	}

	public int getRegularTickets() {
		return regularTickets.get();
	}

	public void setRegularTickets(int regularTickets) {
		this.regularTickets.set(regularTickets);
	}

	public int getHeight() {
		return height.get();
	}

	public void setHeight(int height) {
		this.height.set(height);
	}

	public int getAge() {
		return age.get();
	}

	public void setAge(int age) {
		this.age.set(age);
	}
	
}
