package com.directi.training.dip.exercise_refactor;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Collections;
import java.util.List;

public class NetworkReader implements IReader {
    private String url;

    public NetworkReader(String url) {
        this.url = url;
    }

    @Override
    public List<String> read() throws IOException {
        URL urlObj = new URL(url);
        try (InputStream inputStream = urlObj.openStream();
             InputStreamReader reader = new InputStreamReader(inputStream)) {
            StringBuilder content = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                content.append((char) c);
            }
            return Collections.singletonList(content.toString());
        }
    }
}