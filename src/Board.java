import java.util.Arrays;
import java.util.Objects;

public class Board {

    Character[][] state = new Character[3][3];

    public Character isFinal() {

        // check row
        for (int i = 0; i < this.state.length; i++) {
            if (Arrays.stream(this.state[i]).allMatch(Objects::nonNull) &&
                    Arrays.stream(this.state[i]).allMatch(this.state[i][0]::equals)) {
                return this.state[i][0];
            }
        }

        for (int j = 0; j < this.state[0].length; j++) {
            if(Arrays.stream(this.state).map(x -> x[0]).allMatch(Objects::nonNull) &&
            Arrays.stream(this.state).map(x -> x[0]).allMatch(this.state[j][0]::equals)){
                System.out.println(this.state[0][j]);
                return this.state[0][j];
            }
        }

        Arrays.stream(this.state).map(x -> x[2]).forEach(System.out::println);
//        return this.state[0][j];
        // check diags
//        Arrays.stream(this.state).flatMap().allMatch(s -> s[0].equals(this.state[0][0]));

        return 'X';
    }

    /**
     * Shows the board state.
     */
    public void show() {
        for (int i = 0; i < this.state.length; i++) {
            for (int j = 0; j < this.state[0].length; j++) {
                System.out.print(this.state[i][j] == null ? " " : this.state[i][j]);
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
        //garbage collect and give new state?
        this.state = new Character[3][3];
    }
}
