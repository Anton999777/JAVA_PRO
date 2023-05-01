package hashmap;

import javax.naming.SizeLimitExceededException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws SizeLimitExceededException {
        FileNavigator fileNavigator = new FileNavigator();
        FileData fileData = new FileData("test.txt", 4096, "C:\\Users\\anton\\IdeaProjects\\JAVA_PRO_16.02.2023\\");
        FileData fileData1 = new FileData("demo.txt", 2048, "C:\\Users\\anton\\IdeaProjects\\JAVA_PRO_16.02.2023\\");
        FileData fileData2 = new FileData("str.txt", 1024, "C:\\Users\\anton\\IdeaProjects\\JAVA_PRO_16.02.2023\\HomeWork\\src");
        FileData fileData3 = new FileData("bra.txt", 1024, "C:\\Users\\anton\\IdeaProjects\\JAVA_PRO_16.02.2023\\");
        fileNavigator.add(fileData, "C:\\Users\\anton\\IdeaProjects\\JAVA_PRO_16.02.2023\\");
        fileNavigator.add(fileData1, "C:\\Users\\anton\\IdeaProjects\\JAVA_PRO_16.02.2023\\");
        fileNavigator.add(fileData2, "C:\\Users\\anton\\IdeaProjects\\JAVA_PRO_16.02.2023\\HomeWork\\src");
        fileNavigator.add(fileData3, "C:\\Users\\anton\\IdeaProjects\\JAVA_PRO_16.02.2023\\");


        fileNavigator.getNavigator().get("C:\\Users\\anton\\IdeaProjects\\JAVA_PRO_16.02.2023\\");
        System.out.println(fileNavigator.find("C:\\Users\\anton\\IdeaProjects\\JAVA_PRO_16.02.2023\\"));
        List<FileData> str = fileNavigator.sortBySize(fileNavigator.find("C:\\Users\\anton\\IdeaProjects\\JAVA_PRO_16.02.2023\\"));
        System.out.println(str);
    }
}
