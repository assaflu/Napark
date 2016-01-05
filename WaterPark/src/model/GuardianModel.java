package model;

import javafx.beans.property.SimpleStringProperty;

import java.util.HashMap;
import java.util.Map;

public class GuardianModel {
	public final SimpleStringProperty userName;
	public SimpleStringProperty password;
	public Map<String,ChildModel> children;
	
	public GuardianModel(String userName){
		this.userName = new SimpleStringProperty(userName);
		this.children = new HashMap<String, ChildModel>();
	}

	public void setPassword(String password){
		if(password != null)
			this.password = new SimpleStringProperty(password);
		//TODO error message: password is set.
	}
	
	public Boolean registerChild (ChildModel child){ //TODO: changed the signature of the function
		if(children.containsKey(child.getName())){		// TODO: does copying nessesry here??
			return false;
		}
		children.put(child.getName(), child);
		return true;
	}
	
	public void buyTickets(ChildModel child,RideModel ride, int tickets){
		if(ride.getIsRgular()){
			children.get(child.getName()).setRegularTickets(tickets);
		}
		else{
			//TODO: change the extreme ticket number
		}
	}
	 /* TODO
	  * public void registerChild(Child child);
	  * public void buyTickets(Child child, Ride ride, Int num);
	  * public void cancelTickets(Child child, Ride ride, Int num);
	  * public Ride checkChildLocation(Child child);
	  */
	
}
