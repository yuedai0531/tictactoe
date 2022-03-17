public class Play {

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe");
        Board board = new Board();

        Player p1 = new Player("X", board, 'X');
        Player p2 = new Player("O", board, 'O');
        board.show();
        board.state[1][1] = 'X';
        board.state[2][2] = 'O';
        p1.addMove(1,2);
        board.show();
        board.reset();
        p1.addMove(0,2);
        p1.addMove(1,2);
        p1.addMove(2,2);

//        p2.addMove(0,0);
//        p2.addMove(0,1);
//        p2.addMove(0,2);

        board.isFinal();
        board.show();
    }
}
