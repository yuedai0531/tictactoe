public class Player {
    String name;
    Board board;
    Character token;

    public Player(String name, Board board, Character token) {
        this.name = name;
        this.board = board;
        this.token = token;
        System.out.println("Welcome " + this.name + "! You will play as [" + this.token + "]");
    }

    public boolean addMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Input is invalid, try again");
            return false;
        }

        // have to check if space is available.
        if (this.board.state[row][col] != ' ') {
            System.out.println("Cannot put there, try again");
            return false;
        }

        this.board.state[row][col] = token;
        return true;
    }
}
