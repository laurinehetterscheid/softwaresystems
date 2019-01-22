/**
 * 
 */
package ss.week6.voteMachine;

import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;
import ss.week6.voteMachine.VoteMachine;

/**
 * @author laurine.hetterscheid
 *
 */
public class VoteTUIView implements VoteView, Observer {
	Scanner consoleInput;
	VoteMachine voteMachine;

	/**
	 * 
	 */
	public VoteTUIView(VoteMachine voteMachine) {
		this.voteMachine = voteMachine;
		this.consoleInput = new Scanner(System.in);
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(arg.toString());

	}

	/* (non-Javadoc)
	 * @see ss.week6.voteMachine.VoteView#start()
	 */
	@Override
	public void start() {
		this.printInstructions();
		
		while (consoleInput.hasNextLine()) {
			String command = consoleInput.nextLine();
			commandIdentification(command);
			System.out.print("\nWhat do you what to do?");
		}
	}
	
	

	public void commandIdentification(String command) {
		Scanner scanner = new Scanner(command);

		if (scanner.hasNext()) {
			String firstWord = scanner.next();

			switch (firstWord) {
			case "VOTE":
				this.vote(command);
				break;

			case "ADD":
				this.addParty(command);
				break;

			case "VOTES":
				this.showVotes(this.voteMachine.getVotes());
				break;

			case "PARTIES":
				this.showParties(this.voteMachine.getParties());
				break;

			case "EXIT":
				this.consoleInput.close();
				break;

			case "HELP":
				this.printInstructions();
				break;		

			}
		}
	}

	public void printInstructions () {
		System.out.println(
				"Commands: " +
						"\n VOTE [party]" +
						"\n ADD PARTY [party]" +
						"\n VOTES" +
						"\n PARTIES" +
						"\n EXIT" +
						"\n HELP"
				);
	}
	
	
	private void vote(String command) {
        String party  = command.replaceFirst("VOTE ", "");

        this.voteMachine.vote(party);
    }

    private void addParty (String command) {
        String[] splitCommand = command.split(" ");
        
        if(splitCommand[1].equals("PARTY")) {
            String party = command.replaceFirst("ADD PARTY ", "");
            this.voteMachine.addParty(party);
            return;
        }
    }
	
	

	/* (non-Javadoc)
	 * @see ss.week6.voteMachine.VoteView#showVotes(java.util.Map)
	 */
	@Override
	public void showVotes(Map<String, Integer> votes) {
		System.out.print(votes.toString());
		System.out.flush();
	}

	/* (non-Javadoc)
	 * @see ss.week6.voteMachine.VoteView#showParties(java.util.List)
	 */
	@Override
	public void showParties(List<String> parties) {
		System.out.print(parties.toString());
		System.out.flush();
	}
	


	/* (non-Javadoc)
	 * @see ss.week6.voteMachine.VoteView#showError(java.lang.String)
	 */
	@Override
	public void showError(String message) {
		System.out.println(message);
	}

}
