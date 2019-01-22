package ss.week5;

import ss.week4.tictactoe.Board;
import ss.week4.tictactoe.Mark;
import ss.week4.tictactoe.Player;

public class ComputerPlayer extends Player {
	private Strategy strategy;

	public ComputerPlayer(Mark mark, Strategy strategy) {
		
		super(strategy.getName() + "-" + mark.toString(), mark);
		
		this.strategy = strategy;

	}
	
	public ComputerPlayer(Mark mark) {
		this(mark, new NaiveStrategy());
	}

	@Override
	public int determineMove(Board board) {
		return strategy.determineMove(board, super.getMark());
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	
	//Additionally, it should provide functionality to inspect and update the strategy.

}
