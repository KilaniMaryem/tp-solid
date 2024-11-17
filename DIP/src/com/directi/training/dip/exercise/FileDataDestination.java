package com.directi.training.dip.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileDataDestination implements DataDestinationInt {
    private final String filePath;

    public FileDataDestination(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String encodedData) throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(encodedData);
        }
    }
}