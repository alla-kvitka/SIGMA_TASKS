package taskForFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesController {

    public static String readFromFile(String filename) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename), "Windows-1251");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        while (true) {
            assert scanner != null;
            if (!scanner.hasNextLine()) break;
            sb.append(scanner.nextLine()).append(System.lineSeparator());
        }
        scanner.close();
        return sb.toString().trim();
    }

    public static void writeToFile(String filenameToWrite, String strToWrite) {
        try(FileWriter writer = new FileWriter(filenameToWrite, false))
        {
            writer.write(strToWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
