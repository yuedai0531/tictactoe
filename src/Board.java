public class Board {

    Character[][] state = new Character[3][3];


    public Character isFinal(){

    }

    /**
     * Shows the board state.
     */
    public void show(){
        for (int i = 0; i < state.length; i++) {
            for (int j = 0; j < state[0].length; j++) {
                System.out.print(state[i][j]==null ? " ":state[i][j]);
                System.out.print((j!=2)?"|":"");
            }
            System.out.println();
            System.out.print((i!=2)?"-+-+-":"");
            System.out.println();
        }
    }

    /**
    * Resets the board state.
     */
    public void reset(){
        //garbage collect and give new state?
    }
}
