package hashmap;

import javax.naming.SizeLimitExceededException;
import java.io.File;
import java.lang.module.FindException;
import java.nio.file.NoSuchFileException;
import java.util.*;

public class FileNavigator {

    private HashMap<String, List<FileData>> navigator = new HashMap<>();

    public HashMap<String, List<FileData>> getNavigator() {
        return navigator;
    }

    public void add(FileData fileData, String path) {
        if (fileData.getPathToFile().equals(path)) {
            navigator.computeIfAbsent(fileData.getPathToFile(), k -> new ArrayList<>(1)).add(fileData);
        } else {
            throw new RuntimeException("Key path and file path do not match.");
        }
    }

    public List<FileData> find(String path) {
        return navigator.get(path);

    }

    public List<FileData> filterBySize(int sizeFile) throws SizeLimitExceededException {
        List<FileData> filterBySizeList = new ArrayList<>();
        for (String key : navigator.keySet()) {
            List<FileData> fileData = navigator.get(key);
            for (int i = 0; i < fileData.size(); i++) {
                if (fileData.get(i).getSizeFile() <= sizeFile) {
                    filterBySizeList.add(fileData.get(i));
                }
            }
        }
        if (filterBySizeList.size() == 0) {
            throw new SizeLimitExceededException("All files are larger than the size specified in the method parameter.");
        }
        return filterBySizeList;
    }

    public void remove(String key) {
        navigator.remove(key);
    }

    public List<FileData> sortBySize(List<FileData> unsortedList) {
        unsortedList.sort(new SortBySize());
        return unsortedList;
    }
}
