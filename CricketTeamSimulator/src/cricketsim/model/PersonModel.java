package cricketsim.model;
public class PersonModel {
	private String name;
	private char gender;
	private int age; 
	private Position position;	
	private int appearances;
	private int wickets;
	private int runs;
	private int averageRuns;
	private boolean selected;
	public PersonModel(String a, char b, int c, Position d){
		this.name = a; 
		this.gender = b;
		this.age= c; 
		this.position = d;
	}
	public String getName(){
		return name;
	}
	public char getGenger(){
		return gender;
	}
	public int getAge(){
		return age;
	}
	public Position getPosition(){
		return position;
	}
	public void setRuns(int runs){
		this.runs = runs;
	}
	public void setAppearances(int app){
		this.appearances = app;
	}
	public void setWickets(int wick){
		this.wickets = wick;
	}
	public int getRuns(){
		return runs;
	}
	public int getAppearances(){
		return appearances;
	}
	public int getWickets(){
		return wickets;
	}
	private void averageRuns(){
		averageRuns = (this.runs / this.appearances);
	}
	public int getAverageRuns(){
		this.averageRuns();
		return averageRuns;
	}
	public void setIsSelected(boolean select){
		this.selected = select;
	}
	public boolean getIsSelected(){
		return selected;
	}
	

}
