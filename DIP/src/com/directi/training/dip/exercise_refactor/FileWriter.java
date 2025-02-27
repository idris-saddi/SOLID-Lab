package com.directi.training.dip.exercise_refactor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWriter implements IWriter {
    private String filePath;

    public FileWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(List<String> data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(filePath))) {
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}