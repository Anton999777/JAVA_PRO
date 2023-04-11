package ionio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

public class FileLoggerConfigurationLoader extends FileLoggerConfiguration {

    FileLoggerConfiguration configuration;
    private final String nameCfgFile = "C:\\Users\\anton\\IdeaProjects\\JAVA_PRO_16.02.2023\\HomeWork\\src\\main\\" +
            "resources\\config.properties";

    public FileLoggerConfiguration load() throws IOException {

        File configFile = new File(nameCfgFile);
        Properties properties = new Properties();
        properties.load(new FileReader(configFile));

        int maxSizeFile = Integer.parseInt(properties.getProperty("MAX-SIZE"));
        LoggingLevel level = LoggingLevel.valueOf(properties.getProperty("LEVEL"));

        return configuration = new FileLogger(properties.getProperty("FILE"), level, maxSizeFile, properties.getProperty("FORMAT"));
    }

    @Override
    public void debug(String massage) throws IOException {
        if (load().isDebugEnabled()) {
            log(load().logFile, load().getLoggingLevel(), massage);
        }
    }

    @Override
    public void info(String massage) throws IOException {
        if (load().isInfoEnabled()) {
            log(super.logFile, load().getLoggingLevel(), massage);
        }
    }

    @Override
    public void log(File file, LoggingLevel level, String content) throws IOException {
        LocalDateTime dateTime = LocalDateTime.now().withNano(0);

        String logMassage = "[%s][%s".formatted(dateTime, level + "] Повідомлення: " + content);
        byte[] buffer = logMassage.getBytes();
        checkedSizeFile(buffer.length);
        file = new File(fileName);
        try (FileOutputStream enter = new FileOutputStream(file)) {
            for (byte element : buffer) {
                enter.write(element);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
