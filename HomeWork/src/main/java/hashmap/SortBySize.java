package hashmap;

import java.util.Comparator;

public class SortBySize implements Comparator<FileData> {

    @Override
    public int compare(FileData o1, FileData o2) {
        return Integer.compare(o1.getSizeFile(), o2.getSizeFile());
    }
}
