package cricketsim.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages a list of cricketers.
 * 
* @author Ryan Gouldsmith (ryangouldsmith@gmail.com)
* @author Josh Tumath (josh@joshtumath.me.uk)
*/
public class CollectionOfCricketers {
	/** List of cricketers */
	private List<Cricketer> cricketers = new ArrayList<Cricketer>();
	
	/**
	 * Get the total runs of all cricketers.
	 * @return the total runs of all cricketers
	 */
	public int getTotalRuns() {
		int total = 0;
			
		for (Cricketer cricketer: cricketers) {
			total += cricketer.getRuns();
		}
		
		return total;
	}

	/**
	 * Get a cricketer from a position in the list.
	 * @param index position in the list
	 * @return a cricketer
	 */
	public Cricketer getCricketer(int index) {
		return cricketers.get(index);
	}
	
	/**
	 * Add a cricketer to the list
	 * @param cricketer cricketer to be added to the list
	 */
	public void add(Cricketer cricketer) {
		cricketers.add(cricketer);
	}
	
	/**
	 * Gets the team's average runs.
	 * @returns the team's average
	 */
	public int getTeamAverageRuns(){
		int average = 0;
		
		for (Cricketer cricketer: cricketers){
			average += getTotalRuns() / getTotalAppearances();
		}
		
		return average;
	}
	
	/**
	 * Gets the total number of appearances all the cricketers
	 * @return the total number of appearances.
	 */
	public int getTotalAppearances(){
		int appearance = 0;
		
		for (Cricketer cricketer: cricketers){
			appearance += cricketer.getAppearances();
		}
		
		return appearance;
	}
	
	public int getTotalWickets(){
		int wicketTotal = 0;
		for (Cricketer cricketer: cricketers){
			wicketTotal += cricketer.getWickets();
		}
		return wicketTotal;
	}
}
