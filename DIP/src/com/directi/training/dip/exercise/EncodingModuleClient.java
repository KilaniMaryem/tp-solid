package com.directi.training.dip.exercise;

import java.net.URL;

public class EncodingModuleClient {
    public static void main(String[] args) throws Exception {
        EncodingModule encodingModule = new EncodingModule();

        
        DataSourceInt fileSource = new FileDataSource("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        DataDestinationInt fileDestination = new FileDataDestination("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        encodingModule.encode(fileSource, fileDestination);

        
        DataSourceInt networkSource = new NetworkDataSource(new URL("http", "myfirstappwith.appspot.com", "/index.html"));
        DataDestinationInt databaseDestination = new DatabaseDataDestination(new MyDatabase());
        encodingModule.encode(networkSource, databaseDestination);
    }
}