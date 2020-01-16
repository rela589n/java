package com.company.fourth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileMatrixReader extends MatrixReader {

    private String fileName;

    public FileMatrixReader(int h, int w, String fileName) {
        super(h, w);
        this.fileName = fileName;
    }

    public void read() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));

        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
}
