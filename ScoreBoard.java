/* Store the game entries in the non decreasing order */

public class ScoreBoard {
	private int numEntries = 0;  // number of actual game entries on the board
	private GameEntry[] board;  // array of game entries. 
	
	/* Constructs an empty score board with the given capacity for storing game entries. */ 
	public ScoreBoard(int capacity) {
		board = new GameEntry[capacity];
	}
	
	public int getNum() {
		return numEntries;
	}

	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	// Don't change the code first! You need to 
	// 1. First write Junit test cases. 
	// 2. Run the test cases,
	// 3. Set break point, Run the debugger to reveal the bug 
	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


		public void add(GameEntry e) {
		    if (numEntries < board.length) {
		        int i = numEntries - 1;
		        while (i >= 0 && board[i].getScore() < e.getScore()) {
		            board[i + 1] = board[i];
		            i--;
		        }
		        board[i + 1] = e;
		        numEntries++;
		    } else {
		        // Handle the case where the board is full
		        int i = numEntries - 1;
		        while (i >= 0 && board[i].getScore() < e.getScore()) {
		            if (i < board.length - 1) {
		                board[i + 1] = board[i];
		            }
		            i--;
		        }
		        if (i < board.length - 1) {
		            board[i + 1] = e;
		        }
		    }
		}
			    
	
	/* Return the entry at index i. Throw illegal Argument if there is no game entry at index i */
	public GameEntry get(int i) throws IllegalArgumentException {
		if (i>=0 && i<numEntries) {
			return board[i];
		} else {
			throw new IllegalArgumentException();
		}
	}

	
}
