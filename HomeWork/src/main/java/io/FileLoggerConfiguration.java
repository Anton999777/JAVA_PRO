package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLoggerConfiguration {

    String fileName = "NIO.txt";
    private LoggingLevel loggingLevel;
    private LoggingLevel[] arrayLevels;
    protected int maxSizeFile = 1024;
    private String formatFile = " [ПОТОЧНИЙ_ЧАС][LEVEL] ";

    protected File logFile = new File(fileName);

    public FileLoggerConfiguration() {
    }

    public FileLoggerConfiguration(String fileName, LoggingLevel loggingLevel, int maxSizeFile, String formatFile) {
        if (LoggingLevel.DEBUG.equals(loggingLevel)) {
            arrayLevels = new LoggingLevel[2];
            arrayLevels[0] = LoggingLevel.INFO;
            arrayLevels[1] = LoggingLevel.DEBUG;
        } else {
            arrayLevels = new LoggingLevel[1];
            arrayLevels[0] = LoggingLevel.INFO;
        }
        this.fileName = fileName;
        this.loggingLevel = loggingLevel;
        this.maxSizeFile = maxSizeFile;
        this.formatFile = formatFile;
    }

    public boolean isDebugEnabled() {
        return contains(LoggingLevel.DEBUG);
    }

    public boolean isInfoEnabled() {
        return contains(LoggingLevel.INFO);
    }

    public boolean contains(LoggingLevel level) {
        for (int i = 0; i < arrayLevels.length; i++) {
            if (this.arrayLevels[i].equals(level)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkedSizeFile(int sizeContent) throws IOException {
        if (sizeContent >= maxSizeFile) {
            return createAdditionalFile();
        } else {
            return true;
        }
    }

    public boolean createAdditionalFile() throws IOException {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
        String newLogFile = "LogFile_%s.txt".formatted(dateFormat.format(date));
        File file = new File(newLogFile);
        String massage = ("The file: %s has reached its maximum size. \n" +
                "An additional file was created, there is no path to it: %s").formatted(logFile,file.getAbsoluteFile());
        if (file.createNewFile()) {
            System.out.println(massage);
            return true;
        } else  {
            return false;
        }
    }


    public String getFormatFile() {
        return formatFile;
    }

    public void setFormatFile(String formatFile) {
        this.formatFile = formatFile;
    }

    public int getMaxSizeFile() {
        return maxSizeFile;
    }

    public String getFileName() {
        return fileName;
    }

    public LoggingLevel[] getArrayLevels() {
        return this.arrayLevels;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public void setLoggingLevel(LoggingLevel loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

}
