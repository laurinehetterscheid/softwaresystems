/**
 * 
 */
package ss.week6.voteMachine;


import java.util.HashMap;
import java.util.Map;
import java.util.Observable;


/**
 * @author laurine.hetterscheid
 * Should have methods for adding a vote and retrieving all votes in a Map<String, Integer>
 */
public class VoteList extends Observable {
	private Map<String,Integer> votes;
	
	public VoteList (){
		this.votes = new HashMap<>();
	}
	
	public void addVote(String party) {
		
		if (votes.containsKey(party)) {
            votes.put(party, votes.get(party) + 1);
            this.setChanged();
            this.notifyObservers("Your vote was added to the vote list");
        } 
		else {
            votes.put(party, 1);
            this.setChanged();
            this.notifyObservers("Your vote and your party " + party + " was added to the vote list");
		}
		
		
	}
		
	
	public Map<String, Integer> getVotes() {
		
		return this.votes;
		
	}
	

}
