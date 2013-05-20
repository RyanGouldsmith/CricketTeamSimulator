package cricketsim.model;

import java.util.Vector;

/**
* @author Ryan Gouldsmith (ryangouldsmith@gmail.com)
* @author Josh Tumath (josh@joshtumath.me.uk)
*/
public class CollectionOfCricketers{
	private Vector<Person> loc;
	
	public CollectionOfCricketers(){
		loc = new Vector<Person>();
	}
	
	public int collectionOfRuns(){
		int total = 0;
		for (Person m: loc){
			total += m.getRuns();
		}
		return total;
	}
	
	public Vector<Person> getList(){
		return loc;
	}
	public void addToList(Person a){
		loc.add(a);
	}
	
}
