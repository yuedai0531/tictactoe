public class Play {

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe");
        Board board = new Board();

        Player p1 = new Player("X", board, 'X');
        board.show();
        board.state[1][1] = 'X';
        board.state[2][2] = 'O';
        p1.addMove(1,2);
        board.show();
    }
}
