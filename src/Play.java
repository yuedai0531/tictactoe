public class Play {

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe");
        Board board = new Board();
        board.show();
        board.state[1][1] = "X";
        board.state[2][2] = "O";
        board.show();
    }
}
