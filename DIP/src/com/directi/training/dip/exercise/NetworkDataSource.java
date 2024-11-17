package com.directi.training.dip.exercise;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkDataSource implements DataSourceInt {
    private final URL url;

    public NetworkDataSource(URL url) {
        this.url = url;
    }

    @Override
    public String read() throws Exception {
        StringBuilder content = new StringBuilder();
        try (InputStream in = url.openStream(); InputStreamReader reader = new InputStreamReader(in)) {
            int c;
            while ((c = reader.read()) != -1) {
                content.append((char) c);
            }
        }
        return content.toString();
    }
}