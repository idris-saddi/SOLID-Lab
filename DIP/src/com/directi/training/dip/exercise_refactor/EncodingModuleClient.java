package com.directi.training.dip.exercise_refactor;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule encoder = new EncodingModule();
        
        // File Encoding
        encoder.encode(
            new FileReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt"),
            new FileWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt")
        );
        
        // Network & Database Encoding
        encoder.encode(
            new NetworkReader("http://myfirstappwith.appspot.com/index.html"),
            new DatabaseWriter(new MyDatabase())
        );
    }
}