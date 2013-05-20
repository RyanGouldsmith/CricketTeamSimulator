package cricketsim.model;

import java.util.Vector;

/**
* @author Ryan Gouldsmith (ryangouldsmith@gmail.com)
* @author Josh Tumath (josh@joshtumath.me.uk)
*/
public class CollectionOfCricketers {
	private Vector<Cricketer> cricketers;
	
	public CollectionOfCricketers(){
		cricketers = new Vector<Cricketer>();
	}
	
	public int collectionOfRuns(){
		int total = 0;
		
		for (Cricketer m: cricketers){
			total += m.getRuns();
		}
		
		return total;
	}
	
	public Vector<Cricketer> getList(){
		return cricketers;
	}
	
	public void addToList(Cricketer a){
		cricketers.add(a);
	}
	
}
