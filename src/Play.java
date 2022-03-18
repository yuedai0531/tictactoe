import java.util.Scanner;

public class Play {

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe");
        Board board = new Board();

        Scanner input = new Scanner(System.in);
        System.out.println("Please input player 1 name: ");
        String name1 = input.next();
        Player p1 = new Player(name1, board, 'X');

        System.out.println("Please input player 2 name: ");
        String name2 = input.next();
        Player p2 = new Player(name2, board, 'O');



        while (true) {

            while (true) {
                System.out.println("input row: ");
                int row = input.nextInt();
                System.out.println("input col: ");
                int col = input.nextInt();

                if(p1.addMove(row, col)){
                    System.out.println("p1 end turn");
                    board.show();
                    break;
                }
            }
            if (board.isFinal() != ' ') {
                break;
            }

            while (true) {
                System.out.println("input row: ");
                int row = input.nextInt();
                System.out.println("input col: ");
                int col = input.nextInt();

                if(p2.addMove(row, col)){
                    System.out.println("p2 end turn");
                    board.show();
                    break;
                }
            }
            if (board.isFinal() != ' ') {
                break;
            }
        }

        System.out.println("Winner is: " + board.isFinal());
        board.show();
    }
}
