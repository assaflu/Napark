package model;

import javafx.beans.property.SimpleStringProperty;

public class GuardianModel {
	public final SimpleStringProperty userName;
	public SimpleStringProperty password;
	//TODO array/list of children.
	
	public GuardianModel(String userName){
		this.userName = new SimpleStringProperty(userName);
	}

	public void setPassword(String password) {
		if(password != null)
			this.password = new SimpleStringProperty(password);
		//TODO error message: password is set.
	}
	 /* TODO
	  * public void registerChild(Child child);
	  * public void buyTickets(Child child, Ride ride, Int num);
	  * public void cancelTickets(Child child, Ride ride, Int num);
	  * public Ride checkChildLocation(Child child);
	  */
	
	//hey all
	//hey too
}