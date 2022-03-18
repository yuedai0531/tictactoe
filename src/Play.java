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

            if(board.isFinal() != ' '){
                break;
            }
            break;
        }
        board.show();
        board.state[1][1] = 'X';
        board.state[2][2] = 'O';
        p1.addMove(1, 2);
        board.show();
        board.reset();
        p1.addMove(0, 0);
        p1.addMove(1, 1);
        p1.addMove(2, 2);

//        p2.addMove(0,0);
//        p2.addMove(0,1);
//        p2.addMove(0,2);

        System.out.println("winner is: " + board.isFinal());
        board.show();
    }
}
