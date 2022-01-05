package com.full.arr;
import java.util.*;
//Matrix add

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row= in.nextInt();
        int col=in.nextInt();
        int mat[][]= new int[row][col];
        int mat1[][]=new int[row][col];
        int mat2[][]=new int[row][col];

        for ( int i= 0 ; i < row ; i++ )
        {
            for ( int j= 0 ; j < col ;j++ )
                mat[i][j] = in.nextInt();
        }
        for ( int i= 0 ; i < row ; i++ )
        {
            for ( int j= 0 ; j < col ;j++ )
                mat1[i][j] = in.nextInt();
        }
        for ( int i= 0 ; i < row ; i++ )
        {
            for ( int j= 0 ; j < col ;j++ )
                mat2[i][j] = mat[i][j] + mat1[i][j];
        }
        for (int  i= 0 ; i < row; i++ )
        {
            for (int j=0 ; j < col;j++ )
                System.out.print(mat2[i][j]+" ");
            System.out.println();
        }
    }
}
