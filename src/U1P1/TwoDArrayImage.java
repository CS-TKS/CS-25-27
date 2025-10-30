package U1P1;

import java.sql.SQLOutput;

public class TwoDArrayImage {
    public static void main(String[] args) {
        char[][] pattern = {
                {'.', '.', '#', '#', '.', '.', '.', '.'},
                {'.', '.', '#', '#', '.', '.', '.', '.'},
                {'.', '.', '#', '#', '.', '.', '.', '.'},
                {'.', '.', '#', '#', '.', '.', '.', '.'},
                {'.', '.', '#', '#', '#', '#', '#', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };


        for(int i = 0; i<pattern.length; i++)
        {
            for(int j = 0; j<pattern[i].length; j++)
            {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }

        char[][] mPattern = new char[pattern.length][pattern[0].length];
        for(int i = 0; i<pattern.length; i++)
        {
            for(int j = 0; j<pattern[i].length;j++)
            {
                int k = pattern[i].length-1;
                mPattern[i][k-j] = pattern[i][j];
            }
        }
        for(int i = 0; i<mPattern.length; i++)
        {
            for(int j = 0; j<mPattern[i].length; j++)
            {
                System.out.print(mPattern[i][j]);
            }
            System.out.println();
        }



    }


}
