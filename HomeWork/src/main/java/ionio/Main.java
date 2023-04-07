package ionio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {

FileLoggerConfiguration[] loggerCfg = {
        new FileLogger("Nio.txt",LoggingLevel.DEBUG,1024, "local time and level"),
        new FileLoggerConfigurationLoader() };



    }
}