package com.company.fourth;

import java.io.FileNotFoundException;

public abstract class MatrixReader {
    protected int w, h;
    protected int[][] matrix;

    public MatrixReader(int h, int w) {
        this.w = w;
        this.h = h;

        matrix = new int[h][w];
    }

    abstract public void read() throws FileNotFoundException;

    public int[][] getMatrix() {
        return this.matrix;
    }
}
