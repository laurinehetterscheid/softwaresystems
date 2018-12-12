package ss.week4.tictactoe;

/**
 * Executable class for the game Tic Tac Toe. The game can be played against the
 * computer. Lab assignment Module 2
 * 
 * @author Theo Ruys
 * @version $Revision: 1.4 $
 */
public class TicTacToe {
    public static void main(String[] args) {
        HumanPlayer playerOne = new HumanPlayer(args[0], Mark.XX);
        HumanPlayer playerTwo = new HumanPlayer(args[1], Mark.OO);
        
        Game currentGame = new Game(playerOne, playerTwo);
        
        currentGame.start();
    }
}
