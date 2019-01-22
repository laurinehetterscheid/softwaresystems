package ss.week5;

import ss.week4.tictactoe.*;
/**
 * Executable class for the game Tic Tac Toe. The game can be played against the
 * computer. Lab assignment Module 2
 * 
 * @author Theo Ruys
 * @version $Revision: 1.4 $
 */
public class TicTacToe {
    public static void main(String[] args) {
        Player playerOne; 
        Player playerTwo;
        
        //System.out.println("args " + args[0] + "," + args[1]);
        
        if (args[0].equals("-N")) {
        	playerOne = new ComputerPlayer(Mark.XX);
        }
        if (args[0].equals("-S")) {
        	playerOne = new ComputerPlayer(Mark.XX, new SmartStrategy());
        }
        else {
        	playerOne = new HumanPlayer(args[0], Mark.XX);
        }
        
        if (args[1].equals("-N")) {
        	playerTwo = new ComputerPlayer(Mark.OO);
        }
        if (args[1].equals("-S")) {
        	playerTwo = new ComputerPlayer(Mark.OO, new SmartStrategy());
        }
        else {
        	playerTwo = new HumanPlayer(args[1], Mark.OO);
        }
        
        Game currentGame = new Game(playerOne, playerTwo);
        
        currentGame.start();
    }
}
