package com.company.fifth;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class RectanglesFinder {
    private CharEntity[][] matrix;
    private String filePath;

    public RectanglesFinder(String filePath) {
        this.filePath = filePath;
    }

    public int run() throws IOException {
        File f = new File(this.filePath);
        if (!f.exists() || f.isDirectory()) {
            throw new FileNotFoundException("File not found");
        }

        List<String> strings = Files.readAllLines(Paths.get(this.filePath), Charset.defaultCharset());
        this.matrix = new CharEntity[strings.size()][strings.get(0).length()];

        for (int i = 0; i < strings.size(); ++i) {
            String line = strings.get(i);
            for (int j = 0; j < line.length(); ++j) {
                char el = line.charAt(j);
                matrix[i][j] = new CharEntity(el);
            }
        }

        return handle();
    }

    private int handle() {
        int ans = 0;
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (checkAdd(i, j)) {
                    paintMatrix(i, j);
                    ++ans;
                }
            }
        }

        return ans;
    }

    private boolean checkAdd(int i, int j) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) {
            return false;
        }
        return !matrix[i][j].visited && matrix[i][j].chr == '1';
    }

    private void paintMatrix(int i, int j) {
        matrix[i][j].visited = true;

        if (checkAdd(i + 1, j)) {
            paintMatrix(i + 1, j);
        }
        if (checkAdd(i - 1, j)) {
            paintMatrix(i - 1, j);
        }
        if (checkAdd(i, j + 1)) {
            paintMatrix(i, j + 1);
        }
        if (checkAdd(i, j - 1)) {
            paintMatrix(i, j - 1);
        }
    }
}
