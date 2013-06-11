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
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public int getTotalRuns() {
		return totalRuns;
	}
	
	public void setTotalRuns(int runs) {
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
