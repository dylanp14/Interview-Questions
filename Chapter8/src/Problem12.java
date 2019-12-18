public class Problem12 {
    private boolean[][] chessboard;

    public Problem12(){
        chessboard = new boolean[][]{{false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false}};
    }

    public void insertQueen() {
        int posx = 0;
        int posy = 0;

        while (posy < 8) {
            while (posx < 8) {
                if (!chessboard[posx][posy]) {
                    removeConflictSpaces(posx, posy);
                    System.out.println("("+posx+","+posy+")");
                    break;
                }
                posx++;
            }
            posy++;
        }
    }

    void removeConflictSpaces(int x, int y){

        for (int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if((x-i)-(y-j)==0 || (x-i)+(y-j)==0){
                    chessboard[i][j]=true;
                }
            }
        }
        for (int i=0; i<8; i++){
            chessboard[i][y] = true;
        }
        for (int j=0; j<8; j++){
            chessboard[x][j] = true;
        }
    }
}
