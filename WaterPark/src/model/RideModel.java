package model;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class RideModel {
	public SimpleStringProperty name;
	public SimpleIntegerProperty height;
	public SimpleIntegerProperty age;
	public SimpleIntegerProperty capacity;
	public SimpleBooleanProperty state;
	//TODO: public Timer
	public SimpleBooleanProperty isRgular;
	//TODO: child list
	
	public RideModel(String name, int height, int age, int capacity, Boolean isRegular){
		//TODO: complete
	}

	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
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

	public int getCapacity() {
		return capacity.get();
	}

	public void setCapacity(int capacity) {
		this.capacity.set(capacity);
	}

	public Boolean getState() {
		return state.get();
	}

	public void setState(Boolean state) {
		this.state.set(state);
	}

	public Boolean getIsRgular() {
		return isRgular.get();
	}

	public void setIsRgular(Boolean isRgular) {
		this.isRgular.set(isRgular);
	}
	
	/*
	 * TODO:
	 * addChild
	 * 		validateChildEntry
	 * removeChild
	 */

}
