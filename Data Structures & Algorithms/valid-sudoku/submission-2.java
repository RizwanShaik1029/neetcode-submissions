
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                char c = board[row][col];

                if (c == '.') continue;

                String r = "R" + row + c;
                String cc = "C" + col + c;
                String box = "B" + (row / 3) + (col / 3) + c;

                if (set.contains(r) || set.contains(cc) || set.contains(box))
                    return false;

                set.add(r);
                set.add(cc);
                set.add(box);
            }
        }
        return true;
    }
}