package com.directi.training.dip.exercise_refactor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader implements IReader {
    private String filePath;

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<String> read() throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }
}