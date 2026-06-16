class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> seen = new HashSet<String>();

        for (int r = 0; r < 9; r++)
        {
            for (int c = 0; c < 9; c++)
            {
                char number = board[r][c];

                if (number != '.')
                {
                    String row = number + " in the row " + r;
                    String col = number + " in the col " + c;
                    String subBoard = number + " in the sub board " + r/3 +" - " + c/3;

                    if (!seen.add(row) || !seen.add(col) || !seen.add(subBoard))
                    {
                        return false;
                    }
                } 
            }
        }

        return true;
    }
}
