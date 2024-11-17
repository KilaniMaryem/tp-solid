package com.directi.training.dip.exercise;

import java.util.Base64;

public class EncodingModule {
    public void encode(DataSourceInt dataSource, DataDestinationInt dataDestination) throws Exception {
        String input = dataSource.read();
        String encodedData = Base64.getEncoder().encodeToString(input.getBytes());
        dataDestination.write(encodedData);
    }
}