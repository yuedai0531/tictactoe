public class Player {
    String name;
    Board board;
    Character token;

    public Player(String name, Board board, Character token){
        this.name = name;
        this.board = board;
        this.token = token;
    }

    public void addMove(int row, int col){
        // have to check if space is available.
        this.board.state[row][col] = token;
    }
}
