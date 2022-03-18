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
            getPlayerInput(board, input, p1);
            if (board.isFinal() == p1.token) {
                System.out.println("Winner is: " + p1.name);
                break;
            }

            getPlayerInput(board, input, p2);
            if (board.isFinal() == p2.token) {
                System.out.println("Winner is: " + p2.name);
                break;
            }

            if(board.isFinal() == 't'){
                System.out.println("Game ended in a tie.");
                break;
            }
        }
    }

    private static void getPlayerInput(Board board, Scanner input, Player p1) {
        while (true) {
            System.out.println("row: ");
            int row = input.nextInt();
            System.out.println("col: ");
            int col = input.nextInt();

            if (p1.addMove(row, col)) {
                System.out.println(p1.name + " end turn");
                board.show();
                break;
            }
        }
    }
}
