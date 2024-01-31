
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player implements Comparable<Player>{
	
	private int myScore;
	
	public Player ( ) {
		myScore = 0;
	}
	
	public void increaseScore (int amt) {
		myScore += amt;
	}
	
	public int score ( ) {
		return myScore;
	}
	
	public boolean cooperates ( ){
	   return true;
	}
	
	public void remember (boolean opponentChoice) {		
	}

	public String toString(){
		return this.getClass().getName() + " : " + this.score();
	}

	public int compareTo(Player other){
		return this.score() - other.score();
	}
}