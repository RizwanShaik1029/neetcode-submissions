
class Solution {
    public boolean isValidSudoku(char[][] board) {
        //HashSet<String> set = new HashSet<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                char c = board[row][col];
                if(c=='.')
                {
                    continue;
                }
                else if(!isValid(c,row,col,board))
                {
                    return false;
                }
                /*
                if (c == '.') continue;

                String r = "R" + row + c;
                String cc = "C" + col + c;
                String box = "B" + (row / 3) + (col / 3) + c;

                if (set.contains(r) || set.contains(cc) || set.contains(box))
                    return false;

                set.add(r);
                set.add(cc);
                set.add(box);
                */
            }
        }
        return true;
    }
    public boolean isValid(char c, int row, int col,char[][] board) {

        for (int i = row+1; i < 9; i++) {
            if (board[i][col] == c) {
                return false;
            }
        }
        for (int i = col+1; i < 9; i++) {
            if (board[row][i] == c) {
                return false;
            }
        }
        int br = (row / 3) * 3;
        int bc = (col / 3) * 3;
        for (int i = br; i < br + 3; i++)
        {
            for(int j=bc;j<bc+3;j++)
            {
                if(board[i][j]==c && (i!=row && j!=col))
                {
                    return false;
                }
            }
        }

        return true;
    }
}