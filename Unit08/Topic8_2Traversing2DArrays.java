package Unit08;

public class Topic8_2Traversing2DArrays {
    private static boolean sort(String[][] values, String targ) {
        for (int r = 0; r < values.length; r++)
        {
            for (int c = 0; c < values[0].length; c++)
            {
                if (values[r][c].equals(targ))
                {
                    return true;
                }
            }
        }
        return false;  
    }
    private static void rowR(String[][] values)
    {
        // for (int row = 0; row < 5; row++)
        // {
        //     for (int col = 0; col < 6; col++)
        //     {
        //         System.out.print(grid[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        for (String[] row : values)
        {
            for (String letter : row)
            {
                System.out.print(letter + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    private static void colR(String[][] values)
    {
        for (int col = 0; col < values[0].length; col++)
        {
            for (int row = 0; row < values.length; row++)
            {
                System.out.print(values[row][col] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void main(String[] args) 
    {
        // String[][] a = new String[5][6];
        String[][] abc =
        {
            {"A", "B", "C", "D", "E", "F"},
            {"G", "H", "I", "J", "K", "L"},
            {"M", "N", "O", "P", "Q", "R"},
            {"S", "T", "U", "V", "W", "X"},
            {"Y", "Z", "0", "1", "2", "3"}
        };
        rowR(abc);
        colR(abc);
        System.out.println(sort(abc, "G"));
    }
}
