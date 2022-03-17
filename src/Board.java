public class Board {

    String[][] state = new String[3][3];

//    public String isFinal(){
//
//    }

    public void show(){
        System.out.println(state);

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
}
