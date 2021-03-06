package cricketsim.model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Imports cricketers from various file types and stores them in the model.
 * @author Ryan Gouldsmith (ryangouldsmith@gmail.com)
 * @author Josh Tumath (josh@joshtumath.me.uk)
 */
public class ImportCricketer {
	private BufferedReader cricketReader;
	private Cricketer cricketer;
	private String name;
	private Gender gender;
	private Position position;
	private int appearances; 
	private int wickets; 
	private int totalRuns;
	private CollectionOfCricketers cricketerCollection;
	
	
	public ImportCricketer(CollectionOfCricketers cricketerCollection) {
		this.cricketerCollection = cricketerCollection;
	}


	/**
	 * Reads cricketers in from a CSV file
	 * @throws IOException throws if there is a problem whilst reading the file
	 */
	public CollectionOfCricketers readCricketers() throws IOException {
		// XXX: Test input file:
		cricketReader = new BufferedReader(new FileReader("cricketList.txt"));
		String userDetails;
		
		while((userDetails = cricketReader.readLine()) != null){
			String[] arrayOfDetails = userDetails.split(",");
			cricketer = new Cricketer();
			
			for (int i=0; i < arrayOfDetails.length; i++){
				System.out.println();
				name = arrayOfDetails[0];
				gender = Gender.valueOf(arrayOfDetails[1]);
				position = Position.valueOf(arrayOfDetails[2]);
				wickets = Integer.parseInt(arrayOfDetails[3]);
				totalRuns = Integer.parseInt(arrayOfDetails[4]);
				cricketer.setName(name);
				cricketer.setGender(gender);
				cricketer.setPosition(position);
				cricketer.setAppearances(appearances);
				cricketer.setWickets(wickets);
				cricketer.setTotalRuns(totalRuns);
			}
			System.out.print(cricketer.getName() + " " +  cricketer.getGender() + " " +  cricketer.getPosition() + " " + cricketer.getAppearances() + " " + cricketer.getWickets() + " " + cricketer.getTotalRuns());
			cricketerCollection.add(cricketer);
			
		}
		
		cricketReader.close();
		return cricketerCollection;
	}
}			