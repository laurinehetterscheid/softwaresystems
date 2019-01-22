/**
 * 
 */
package ss.week5;

import ss.week4.tictactoe.Board;
import ss.week4.tictactoe.Mark;

/**
 * @author laurine.hetterscheid
 *
 */
public class SmartStrategy extends NaiveStrategy {

	/**
	 * 
	 */
	public SmartStrategy() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see ss.week5.Strategy#getName()
	 */
	@Override
	public String getName() {
		return "Smart";
	}

	/* (non-Javadoc)
	 * @see ss.week5.Strategy#determineMove(ss.week4.tictactoe.Board, ss.week4.tictactoe.Mark)
	 */
	@Override
	public int determineMove(Board b, Mark m) {
		
		if (b.isEmptyField(4)) {
			return 4;
		}
		
		int winnendeZet = winningMove(b, m);
		if (winnendeZet >= 0) {
			return winnendeZet;
		}
		
		int blokkade = opponentBlock(b, m);
		if (blokkade >= 0) {
			return blokkade;
		}

		return super.determineMove(b,m);
	}
	
	public int gaatDeRijWinnen(Board b, Mark m) {
		
		for (int i = 0; i < (Board.DIM*Board.DIM); i+=Board.DIM) {
			
			int markCounter = 0;
			int lastEmptyFieldIndex = -1;
			for (int j = i; j < i+Board.DIM; j++) {
				
				if (b.getField(j).equals(m)) {
					markCounter++;
				}
				else if (b.getField(j).equals(Mark.EMPTY)) {
					lastEmptyFieldIndex = j;
				}
			}
			
			if (markCounter == 2) {
				return lastEmptyFieldIndex;
			}
		}
		return -1;
	}
	
	public int gaatDeKolomWinnen(Board b, Mark m) {
		
		// zoek de kolom -- 0, 3, 6  1, 4, 7   2, 5, 8
		for (int i = 0; i < Board.DIM; i++) {
			
			int markCounter = 0;
			int lastEmptyFieldIndex = -1;
			for (int j = i; j < (Board.DIM*Board.DIM); j+=Board.DIM) {
				
				if (b.getField(j).equals(m)) {
					markCounter++;
				}
				else if (b.getField(j).equals(Mark.EMPTY)) {
					lastEmptyFieldIndex = j;
				}
			}
			
			if (markCounter == 2) {
				return lastEmptyFieldIndex;
			}
		}
		return -1;	
	}
	
	public int gaatDeDiagonaalWinnen(Board b, Mark m) {
		
		//zoek de diagonaal -- 0, 4, 8  &  2, 4, 6
		for (int i = 0; i < Board.DIM; i+=(Board.DIM-1)) {
			
			int markCounter = 0;
			int lastEmptyFieldIndex = -1;
			for (int j = i; j < (Board.DIM*Board.DIM); j+=(Board.DIM-i+1)) {
				
				if (b.getField(j).equals(m)) {
					markCounter++;
				}
				else if (b.getField(j).equals(Mark.EMPTY)) {
					lastEmptyFieldIndex = j;
				}
			}
			
			if (markCounter == 2) {
				return lastEmptyFieldIndex;
			}
		}
		return -1;	
	}
	
	public int winningMove(Board b, Mark m) {
		
		int rijWint = gaatDeRijWinnen(b, m);
		if (rijWint >=0) {
			return rijWint;
		}
		
		int kolomWint = gaatDeKolomWinnen(b, m);
		if (kolomWint >= 0) {
			return kolomWint;
		}
		
		int diagonaalWint = gaatDeDiagonaalWinnen(b, m);
		if (diagonaalWint >= 0) {
			return diagonaalWint;
		}
		return -1;
	}
	
	public int opponentBlock(Board b, Mark m) {
		
		if (m.equals(Mark.OO)) {
			return winningMove(b, Mark.XX);
		}
		if (m.equals(Mark.XX)) {
			return winningMove(b, Mark.OO);
		}
		
		return -1;
		
	}

}
