package com.company.fourth;

public class NegativeCountFinder {
    private int[][] matrix;

    public NegativeCountFinder(int [][] matrix) {
        this.matrix = matrix;
    }

    public int findNegativeCount(int area) throws Exception {
        if (area < 1 || area > 4) {
            throw new Exception("Area must be between 1 and 4");
        }

        int startI, endI;
        int startJ, endJ;

        if (area <= 2) {
            startI = 0;
            endI = (this.matrix.length - 1) >> 1;
        }
        else {
            startI = (this.matrix.length) >> 1;
            endI =  this.matrix.length - 1;
        }

        if ((area & 1) != 0){
            startJ = 0;
            endJ = (this.matrix[0].length - 1) >> 1;
        }
        else {
            startJ = this.matrix[0].length >> 1;
            endJ = this.matrix[0].length - 1;
        }

        int ans = 0;
        for (int i = startI; i <= endI; ++i) {
            for (int j = startJ; j <= endJ; ++j) {
                if (matrix[i][j] < 0) {
                    ++ans;
                }
            }
        }

        return ans;
    }
}
