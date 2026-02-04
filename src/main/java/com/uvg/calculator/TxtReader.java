package com.uvg.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TxtReader {

    private final BufferedReader reader;

    public TxtReader(String resourceName) {
        InputStream is = getClass()
                .getClassLoader()
                .getResourceAsStream(resourceName);

        if (is == null) {
            throw new RuntimeException("not found: " + resourceName);
        }

        this.reader = new BufferedReader(new InputStreamReader(is));
    }

    public String nextLine() throws IOException {
        return reader.readLine();
    }

    public void close() throws IOException {
        reader.close();
    }
}
