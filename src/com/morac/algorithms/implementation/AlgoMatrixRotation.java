package com.morac.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 04/05/2016.
 */
public class AlgoMatrixRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        int rotation = in.nextInt();
        int mat[][] = new int[rows][cols];
        int resultMat[][]=new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        rows--;
        cols--;
        for (int r = 0; r <= rows; r++) {
            for (int c = 0; c <= cols; c++) {
                int rowTmp = Math.min(r, rows - r);
                int colTmp = Math.min(c, cols - c);
                int min = Math.min(rowTmp, colTmp);
                int maxRow = rows - min;
                int maxCol = cols - min;
                int totalElements = (maxRow + maxCol) * 2 - min * 4;

                int curRow = r;
                int curCol = c;
                for (int i = 0; i < rotation % totalElements; i++) {
                    if (curCol == min && curRow < maxRow) {
                        curRow++;
                    }else if (curRow == maxRow && curCol < maxCol){
                        curCol++;
                    }else if (curRow > min && curCol == maxCol){
                        curRow--;
                    }else if(curRow == min && curCol > min){
                        curCol--;
                    }
                }
                resultMat[curRow][curCol] = mat[r][c];
            }
        }
        rows++;
        cols++;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMat[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
