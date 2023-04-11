package ionio;

public class FileMaxSizeReachedException extends RuntimeException {
    public FileMaxSizeReachedException(String s) {
        super(s);
    }
}
