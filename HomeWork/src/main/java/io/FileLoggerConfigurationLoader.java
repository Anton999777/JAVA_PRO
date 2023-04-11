package io;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

public class FileLoggerConfigurationLoader {

    FileLoggerConfiguration configuration;
    private final String nameCfgFile = "C:\\Users\\anton\\IdeaProjects\\JAVA_PRO_16.02.2023\\HomeWork\\src\\main\\" +
            "resources\\config.properties";

    public FileLoggerConfiguration load() throws IOException {

        File configFile = new File(nameCfgFile);
        Properties properties = new Properties();
        properties.load(new FileReader(configFile));

        int maxSizeFile = Integer.parseInt(properties.getProperty("MAX-SIZE"));
        LoggingLevel level = LoggingLevel.valueOf(properties.getProperty("LEVEL"));

        return configuration = new FileLoggerConfiguration(properties.getProperty("FILE"), level, maxSizeFile,
                properties.getProperty("FORMAT"));
    }

}
