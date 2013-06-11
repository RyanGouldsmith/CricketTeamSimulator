package cricketsim.model;

import java.util.Date;

/**
* @author Ryan Gouldsmith (ryangouldsmith@gmail.com)
* @author Josh Tumath (josh@joshtumath.me.uk)
*/
public class Cricketer {
	/** Full name */
	private String name;
	
	/** Gender */
	private Gender gender;
	
	/** Date of birth */
	private Date dateOfBirth;
	
	/** Position on the field */
	private Position position;
	
	/** The number of times this player has played a game */
	private int appearances;
	
	/** ??? */
	private int wickets;
	
	/** The total number of runs this player has made */
	private int totalRuns;
	
	private CollectionOfCricketers listOfCricketers;
	
	/**
	 * Constructs a new cricket player.
	 * @param name
	 * @param gender
	 * @param dateOfBirth
	 * @param position
	 */
	public Cricketer(String name, Gender gender, Date dateOfBirth, Position position) {
		this.name = name; 
		this.gender = gender;
		this.dateOfBirth = dateOfBirth; 
		this.position = position;
		listOfCricketers = new CollectionOfCricketers();
		listOfCricketers.add(this);
	}
	public String getName() {
		return name;
	}
	
	public Gender getGenger() {
		return gender;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public int getRuns() {
		return totalRuns;
	}
	
	public void setRuns(int runs) {
		this.totalRuns = runs;
	}
	
	public int getAppearances() {
		return appearances;
	}
	
	public void setAppearances(int appearances) {
		this.appearances = appearances;
	}
	
	public int getWickets() {
		return wickets;
	}
	
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	public int getAverageRuns() {
		return totalRuns / appearances;
	}
}
