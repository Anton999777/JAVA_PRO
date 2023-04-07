package ionio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;


public class FileLogger extends FileLoggerConfiguration {
    public FileLogger(String fileName, LoggingLevel loggingLevel, int maxSizeFile, String formatFile) {
        super(fileName, loggingLevel, maxSizeFile, formatFile);
    }


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

    public void debug(String massage) throws IOException {
        if (super.isDebugEnabled()) {
            log(super.logFile, super.getLoggingLevel(), massage);
        }
    }

    public void info(String massage) throws IOException {
        if (super.isInfoEnabled()) {
            log(super.logFile, super.getLoggingLevel(), massage);
        }
    }

}
