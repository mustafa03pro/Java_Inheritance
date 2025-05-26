package com.may23.inheritance;

import java.util.Scanner;
public class BowlerTest  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String bowlerName=sc.nextLine();
        int  bowlerWickets=Integer.parseInt(sc.nextLine());
        int  bowlerMatches=Integer.parseInt(sc.nextLine());
        int  balls_bowled=Integer.parseInt(sc.nextLine());
        int  runs_conceded=Integer.parseInt(sc.nextLine());
        
       
        Bowler b1=new Bowler(bowlerName, bowlerWickets, bowlerMatches, balls_bowled, runs_conceded);
        System.out.println(b1);
        b1.computeBowlingAverage();
        b1.computeStrikeRate();
        
    }
}
class Bowler  {
    private String  bowlerName;
    private int  bowlerWickets ;
   
    private int   bowlerMatches;
    private int  balls_bowled ;
    private int runs_conceded;
    
    public Bowler(String bowlerName, int bowlerWickets, int bowlerMatches, int balls_bowled, int runs_conceded) {
		super();
		this.bowlerName = bowlerName;
		this.bowlerWickets = bowlerWickets;
		this.bowlerMatches = bowlerMatches;
		this.balls_bowled = balls_bowled;
		this.runs_conceded = runs_conceded;
	}
    public void computeBowlingAverage() {
    	if(bowlerMatches<0||balls_bowled<0) {
    		System.out.println("Error");
    		System.out.println("Error");
    		System.out.println("Error");
    		System.exit(0);
    		
    	}
    	float bowlingAvg = (float) runs_conceded / bowlerWickets;
    	System.out.println("Name:"+bowlerName);
    	System.out.println("bowling_avg:"+bowlingAvg);
    }
	
    @Override
	public String toString() {
		return "Name=" + bowlerName + "\n Wickets=" + bowlerWickets + "\n Matches="
				+ bowlerMatches + "\n balls_bowled=" + balls_bowled + "\n runs_conceded=" + runs_conceded ;
	}
	public void computeStrikeRate(){
		 float strikeRate = (float) runs_conceded / balls_bowled;
		 System.out.println("Name:"+bowlerName);
	    	System.out.println("strikeRate:"+strikeRate);
       
        
    }


}
