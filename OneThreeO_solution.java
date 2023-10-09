public class OneThreeO_solution {
    static boolean[][] board_res;
    public void solve(char[][] board) {
        board_res = new boolean[board.length][board[0].length];
        checkTheEdge(board);

        board_res[0][0]= board[0][0] == 'O';
        board_res[0][board[0].length-1]= board[0][board[0].length-1] == 'O';
        board_res[board.length-1][0]= board[board.length-1][0] == 'O';
        board_res[board.length-1][board[0].length-1]= board[board.length-1][board[0].length-1] == 'O';


        for(int i=0;i<board.length;++i){
            for(int j=0;j<board[0].length;++j){
                board[i][j]=board_res[i][j]?'O':'X';
            }
        }
    }

    private  void checkTheEdge(char[][] board){
        int height = board.length;
        int width = board[0].length;
        for(int i=1;i<width-1;++i){
            if(board[0][i]=='O'){
                board_res[0][i]= true;
                if(height>2){
                    checkNode(board,1,i);
                }
            }
            if(board[height-1][i]=='O'){
                board_res[height-1][i]=true;
                if(height>2){
                    checkNode(board,height-2,i);
                }
            }
        }
        for(int i=1;i<height-1;++i){
            if(board[i][0]=='O'){
                board_res[i][0]=true;
                if(width>2){
                    checkNode(board,i,1);
                }
            }
            if(board[i][width-1]=='O'){
                board_res[i][width-1]=true;
                if(width>2){
                    checkNode(board,i,width-2);
                }
            }
        }
    }

    private  void checkNode(char[][] board, int x, int y){
        if(board_res[x][y]){
            return;
        }
        if(board[x][y]=='O'){
            board_res[x][y]=true;
            if(x>1){
                checkNode(board,x-1,y);
            }
            if(x<board.length-2){
                checkNode(board,x+1,y);
            }
            if(y>1){
                checkNode(board,x,y-1);
            }
            if(y<board[0].length-2){
                checkNode(board,x,y+1);
            }
        }
    }

}
