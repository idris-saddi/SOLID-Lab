package com.directi.training.dip.exercise_refactor;

import java.io.IOException;
import java.util.List;

public interface IReader {
    List<String> read() throws IOException;
}