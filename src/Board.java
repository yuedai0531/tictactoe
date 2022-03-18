import java.util.Arrays;
import java.util.Objects;

public class Board {

    Character[][] state = new Character[3][3];

    public Board() {
        for (Character[] row : this.state)
            Arrays.fill(row, ' ');
    }

    /**
     * Checks if the game is finished.
     */
    public Character isFinal() {
        // check row
        for (int i = 0; i < this.state.length; i++) {
            if (Arrays.stream(this.state[i]).allMatch(Objects::nonNull) &&
                    Arrays.stream(this.state[i]).allMatch(this.state[i][0]::equals)) {
                return this.state[i][0];
            }
        }

        // check columns
        if (Arrays.stream(this.state).map(x -> x[0]).allMatch(Objects::nonNull) &&
                Arrays.stream(this.state).map(x -> x[0]).allMatch(this.state[0][0]::equals)) {
            return this.state[0][0];
        }
        if (Arrays.stream(this.state).map(x -> x[1]).allMatch(Objects::nonNull) &&
                Arrays.stream(this.state).map(x -> x[1]).allMatch(this.state[0][1]::equals)) {
            return this.state[0][1];
        }
        if (Arrays.stream(this.state).map(x -> x[2]).allMatch(Objects::nonNull) &&
                Arrays.stream(this.state).map(x -> x[2]).allMatch(this.state[0][2]::equals)) {
            return this.state[0][2];
        }

        // check diagonals
        if (this.state[0][0] == this.state[1][1] && this.state[1][1] == this.state[2][2])
            return this.state[1][1];
        if (this.state[0][2] == this.state[1][1] && this.state[1][1] == this.state[2][0])
            return this.state[1][1];

        return ' ';
    }

    /**
     * Shows the board state.
     */
    public void show() {
        for (int i = 0; i < this.state.length; i++) {
            for (int j = 0; j < this.state[0].length; j++) {
                System.out.print(this.state[i][j] == ' ' ? " " : this.state[i][j]);
                System.out.print((j != 2) ? "|" : "");
            }
            System.out.println();
            System.out.print((i != 2) ? "-+-+-" : "");
            System.out.println();
        }
    }

    /**
     * Resets the board state.
     */
    public void reset() {
        this.state = new Character[3][3];
    }
}
