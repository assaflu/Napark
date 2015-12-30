package model;

import java.util.Map;

public class MainComputerModel {
	public static MainComputerModel INSTANCE = new MainComputerModel();
	public Map<String,RideModel> rides;
	public Map<Integer, ChildModel> children;
	public Map<String,GuardianModel> guardians;
	public int totalRegTickets;
	public Map<String, Integer> extremeTicket;
	
	private MainComputerModel()
	{
		
	}
	
	/*
	 * TODO: all the functions that requaired for the park
	 */
}
