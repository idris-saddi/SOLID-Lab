package com.directi.training.dip.exercise_refactor;

import java.io.IOException;
import java.util.List;

public interface IWriter {
    void write(List<String> data) throws IOException;
}