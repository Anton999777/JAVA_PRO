package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;


public class FileLogger {

    FileLoggerConfiguration configuration = new FileLoggerConfiguration();

    private void log(File file, LoggingLevel level, String content) throws IOException {
        LocalDateTime dateTime = LocalDateTime.now().withNano(0);

        String logMassage = "[%s][%s".formatted(dateTime, level + "] Повідомлення: " + content);
        byte[] buffer = logMassage.getBytes();
        configuration.checkedSizeFile(buffer.length);
        file = new File(configuration.fileName);
        try (FileOutputStream enter = new FileOutputStream(file)) {
            for (byte element : buffer) {
                enter.write(element);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void debug(String massage) throws IOException {
        FileLoggerConfiguration cfg = new FileLoggerConfiguration(configuration.getFileName(), LoggingLevel.DEBUG,
                configuration.getMaxSizeFile(), configuration.getFormatFile());

        if (cfg.isDebugEnabled()) {
            log(cfg.logFile, cfg.getLoggingLevel(), massage);
        }
    }

    public void info(String massage) throws IOException {
        FileLoggerConfiguration cfg = new FileLoggerConfiguration(configuration.getFileName(), LoggingLevel.INFO,
                configuration.getMaxSizeFile(), configuration.getFormatFile());

        if (cfg.isInfoEnabled()) {
            log(cfg.logFile, cfg.getLoggingLevel(), massage);
        }
    }

}
