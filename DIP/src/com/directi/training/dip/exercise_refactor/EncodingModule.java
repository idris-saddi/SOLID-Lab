package com.directi.training.dip.exercise_refactor;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

public class EncodingModule {
    public void encode(IReader reader, IWriter writer) throws IOException {
        List<String> inputData = reader.read();
        List<String> encodedData = new ArrayList<>();
        for (String line : inputData) {
            encodedData.add(Base64.getEncoder().encodeToString(line.getBytes()));
        }
        writer.write(encodedData);
    }
}