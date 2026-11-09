class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hash = new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char c = board[i][j];
                if(c!='.')
                {
                    if(!isValid(c,i,j,board,hash))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isValid(char c, int row, int col,char[][] board,HashSet<String> hash)
    {
        
        String r = row+" row "+c;
        String co = col+" col "+c;
        String br = ((row/3)*3)+" row : col "+ ((col/3)*3)+" "+c;
        if(hash.contains(r) || hash.contains(co) || hash.contains(br))
        {
            return false;
        }
        hash.add(r);
        hash.add(co);
        hash.add(br);
        return true;
    }
}
