package ss.week6.voteMachine;

import java.util.List;
import java.util.Map;

import ss.week6.voteMachine.gui.VoteGUIView;

public class VoteMachine {
	private VoteList voteList;
	private PartyList partyList;
	private VoteView voteView;
	
	
	public static void main (String args[]) {
		
		VoteMachine voteMachine = new VoteMachine();
		
		voteMachine.start();
		
	}

	public VoteMachine() {
		this.voteList = new VoteList();
		this.partyList = new PartyList();
		this.voteView = new VoteGUIView(this);
		
		this.voteList.addObserver(voteView);
		this.partyList.addObserver(voteView);
	}
	
	public void start() {
		this.voteView.start();
	}
	
	
	public void addParty(String party) {
		this.partyList.addParty(party);
	}
	
	public void vote(String party) {
		this.voteList.addVote(party);
		
	}
	
	
	public Map<String, Integer> getVotes() {
		return this.voteList.getVotes();
	}
	
	
	public List<String> getParties() {
		return this.partyList.getParties();
	}
	
	

}
