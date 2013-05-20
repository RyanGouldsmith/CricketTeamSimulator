package cricketsim.model;

import java.util.Vector;

public class CollectionOfCricketers{
	private Vector<PersonModel> loc;
	
	
	public CollectionOfCricketers(){
		loc = new Vector<PersonModel>();
	}
	
	public int collectionOfRuns(){
		int total = 0;
		for (PersonModel m: loc){
			total += m.getRuns();
		}
		return total;
	}
	
	public Vector<PersonModel> getList(){
		return loc;
	}
	public void addToList(PersonModel a){
		loc.add(a);
	}
	
}
