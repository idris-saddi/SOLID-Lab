package com.directi.training.dip.exercise_refactor;

import java.io.IOException;
import java.util.List;

public class DatabaseWriter implements IWriter {
    private MyDatabase database;

    public DatabaseWriter(MyDatabase database) {
        this.database = database;
    }

    @Override
    public void write(List<String> data) throws IOException {
        for (String line : data) {
            database.write(line);
        }
    }
}