package hashmap;

import java.util.Objects;

public class FileData {
    private String nameFile;
    private int sizeFile;
    private String pathToFile;

    public FileData(String nameFile, int sizeFile, String pathToFile) {
        this.nameFile = nameFile;
        this.sizeFile = sizeFile;
        this.pathToFile = pathToFile;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public int getSizeFile() {
        return sizeFile;
    }

    public void setSizeFile(int sizeFile) {
        this.sizeFile = sizeFile;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileData fileData = (FileData) o;
        return sizeFile == fileData.sizeFile && Objects.equals(nameFile, fileData.nameFile)
                && Objects.equals(pathToFile, fileData.pathToFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFile, sizeFile, pathToFile);
    }

    @Override
    public String toString() {
        return "FileData{" +
                "nameFile='" + nameFile + '\'' +
                ", sizeFile=" + sizeFile +
                ", pathToFile='" + pathToFile + '\'' +
                '}';
    }
}
