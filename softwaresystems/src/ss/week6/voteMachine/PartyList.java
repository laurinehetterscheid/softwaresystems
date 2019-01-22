/**
 * 
 */
package ss.week6.voteMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * @author laurine.hetterscheid
 * Should store all the parties in the system and have a method for adding a party and retrieving all parties in a List
 */
public class PartyList extends Observable {
	private List<String> parties;
	
	public PartyList() {
		this.parties = new ArrayList<>();
	}

	public void addParty(String partyName) {
		
		if (!parties.contains(partyName)) {
			parties.add(partyName);
			this.setChanged();
			this.notifyObservers(partyName + " was added to the party list");
		}
		else {
			this.notifyObservers(partyName + " already exists in the party list");
		}
		
	}
	
	public List<String> getParties() {
		
		return this.parties;
		
	}
	
	

}
