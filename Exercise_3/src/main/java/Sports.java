//@author Vinod Muley
import java.util.*;
import java.io.*;

interface team
{	
	void updatePoints(String status);
	String getTeamName();
	int getPoints(); 
}

class FootballTeam implements team, Comparator<FootballTeam>
{

	private String teamName;
	private int points;
	private String sponsor;
	
	public FootballTeam()
	{
		String teamName="";
		int points=0;
		String sponsor="";	
	}
	
	public FootballTeam(String teamName,int points,String sponsor)
	{
		this.teamName=teamName;
		this.points=points;
		this.sponsor=sponsor;
	}

	//Update Points accourding to status win,drawn
	public void updatePoints(String status) 
	{
		if(status.equals("Win"))
		{

			this.points += 3;
		}
		if(status.equals("Drawn"))
		{
	    
			this.points += 1;
		}		
	}

	public String getTeamName() {
		return this.teamName;
	}

	public int getPoints() {
		return this.points;		
	}
	public String getSponsor() {
		return this.sponsor;		
	}

	@Override
	public int compare(FootballTeam a, FootballTeam b)
	{
		return a.getPoints() - b.getPoints();
	}
}

class BasketballTeam implements team,Comparator<BasketballTeam>
{
	private String teamName;
	private int points;

	public BasketballTeam()
	{
		String teamName="";
		int points=0;
	}
	
	public BasketballTeam(String teamName,int points)
	{
		this.teamName=teamName;
		this.points=points;
	}
	
	
	public void updatePoints(String status) 
	{
		if(status.equals("Win"))
		{
			this.points += 2;
		}
	}
	public int compare(FootballTeam a, FootballTeam b)
	{
		return a.getPoints() - b.getPoints();
	}
	public String getTeamName() {
		return this.teamName;
	}

	public int getPoints() {
		return this.points;		
	}


	@Override// Sorting in ascending order of points
	public int compare(BasketballTeam a, BasketballTeam b)
	{
		return a.getPoints() - b.getPoints();
	}
}

public class Sports  {

	//Reading file from Resource Section
	public static BufferedReader readFile(String fileName) throws FileNotFoundException {

		String path ="src/main/resources/"+fileName;
		BufferedReader br = new BufferedReader(new FileReader(path));
		return br;
	}

	public static void printSortedList(ArrayList<FootballTeam> ft,ArrayList<BasketballTeam> bt)
	{

		//Sorting FootBallTeam Points by Points
		Collections.sort(ft, new FootballTeam());

		//Sorting BasketballTeam Points by Points
		Collections.sort(bt, new BasketballTeam());

		//Printing FootballTeam Data
		System.out.println("Football Team");
        System.out.println("TeamName  Points    Sponsor");
        for (int i = 0; i < ft.size(); i++)
        {
            System.out.println(ft.get(i).getTeamName()+"  "+ft.get(i).getPoints()+"  "+ft.get(i).getSponsor());
        }

		//For Formatting Output
		System.out.println("");
		System.out.println("-----------------------------------------");
		System.out.println("");

		//Printing BasketballTeam Data
        System.out.println("Basketball Team");
		System.out.println("TeamName  Points ");
        for (int i = 0; i < bt.size(); i++)
        {
            System.out.println(bt.get(i).getTeamName()+"  "+bt.get(i).getPoints());
        }
	}
	
	public static void main(String[] args) 
	{
		BufferedReader teamsFile = null;
		try {
			teamsFile = readFile("teams.csv");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		//Store FootballTeam Objects
		ArrayList<FootballTeam> ft =new ArrayList<FootballTeam>();
		//Store BasketballTeam Objects
		ArrayList<BasketballTeam> bt =new ArrayList<BasketballTeam>();

		FootballTeam football;
		BasketballTeam basketball;
		        

		//Extracting Values From teams.csv
        String line;
        try {
			while ((line = teamsFile.readLine()) != null) 
			{
				String details[]=line.split(",");
				if(details[0].equals("Basketball"))
				{
					//Storing Object of  BasketballTeam in ArrayList of BasketballTeam
					basketball=new BasketballTeam(details[1],Integer.parseInt(details[2]));
					 bt.add(basketball);
				}
				if(details[0].equals("Football"))
				{
					//Storing Object of FootballTeam in ArrayList of FootballTeam
					football=new FootballTeam(details[1],Integer.parseInt(details[2]),details[3]);
					ft.add(football);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		//Printing Previous Points
		System.out.println("Previous Points");
        printSortedList(ft,bt);
        
        //Reading Result.csv File
    	BufferedReader resultFile = null;
		try {
			resultFile = readFile("results.csv");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
        
		//Creating ArrayList to Store Values of results.csv file
	    ArrayList<String[]> str =new ArrayList<>();


		//Extracting Values From result.csv
        try {
			while ((line = resultFile.readLine()) != null) 
			{
				String details[]=line.split(",");
				str.add(details);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


		//Updating  Points  by Calling updatePoints() function
		for(int i=0;i<str.size();i++)
		{
	        int j=0;
        	for(int l=0;l<ft.size();l++)
        	{
        		if(ft.get(l).getTeamName().equals(str.get(i)[0]))
        		{
        			ft.get(l).updatePoints(str.get(i)[1]);
        			j++;
        		}
        	}
        	if(j==0)
        	{
	        	for(int l=0;l<bt.size();l++)
	        	{
	        		if(bt.get(l).getTeamName().equals(str.get(i)[0]))
	        		{
	        			bt.get(l).updatePoints(str.get(i)[1]);
	        		}
	        	}
        	}
	      
		}


		//Printing Updated Points
		System.out.println("-----------------------------------------");
		System.out.println("");
        System.out.println("Updated Points");
		System.out.println("");
        printSortedList(ft,bt);

	}

}
