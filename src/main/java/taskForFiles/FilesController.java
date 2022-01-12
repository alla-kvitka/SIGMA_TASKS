package taskForFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

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
        try (FileWriter writer = new FileWriter(filenameToWrite, false)) {
            writer.write(strToWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFileVolumedWithParameter(String... filesToRead) {
        InterfaceForSortDataFromFile i1 = (String... fileToRead) -> {
            for (String file : fileToRead) {
                StringBuilder volume05 = new StringBuilder();
                StringBuilder volume099 = new StringBuilder();
                StringBuilder volume1 = new StringBuilder();
                String[] lines = readFromFile(file).split("\\s\n");
                for (String line : lines) {
                    String[] words = line.split("\\s+");
                    if (Double.valueOf(words[2]) <= 0.5) {
                        volume05.append(line).append("\n");
                    }
                    if (Double.valueOf(words[2]) > 0.5 && Double.valueOf(words[2]) < 0.99) {
                        volume099.append(line).append("\n");
                    } else
                        volume1.append(line).append("\n");
                }
                writeToFile("src/main/java/taskForFiles/volume05.txt", volume05.toString());
                writeToFile("src/main/java/taskForFiles/volume099.txt", volume099.toString());
                writeToFile("src/main/java/taskForFiles/volume1.txt", volume1.toString());
            }
        };
        i1.writeSortedDataToFile(filesToRead);
    }

    public static void sortDataInFiles(int sortType, String fileToRead, String fileToWrite) {
        List<Bottle> bottlesList = new ArrayList<>();
        String[] lines = readFromFile(fileToRead).split("\\s\n");
        for (String line : lines) {
            String[] words = line.split("\\s+");
            bottlesList.add(new Bottle(Integer.parseInt(words[0]), words[1],
                    Double.parseDouble(words[2]), words[3]));
        }
        if (sortType == 1) {
            Collections.sort(bottlesList, new Comparator<Bottle>() {
                @Override
                public int compare(Bottle o1, Bottle o2) {
                    if (o1.getBottle().compareTo(o2.getBottle()) != 0)
                        return o1.getBottle().compareTo(o2.getBottle());
                    else if (o1.getVolume().compareTo(o2.getVolume()) != 0)
                        return o1.getVolume().compareTo(o2.getVolume());
                    else
                        return o1.getMaterial().compareTo(o2.getMaterial());
                }
            });
            writeToFile(fileToWrite, bottlesList.toString());
        }
        if (sortType == 2) {
            Collections.sort(bottlesList, new Comparator<Bottle>() {
                @Override
                public int compare(Bottle o1, Bottle o2) {
                    if (o1.getVolume().compareTo(o2.getVolume()) != 0)
                        return o1.getVolume().compareTo(o2.getVolume());
                    else if (o1.getMaterial().compareTo(o2.getMaterial()) != 0)
                        return o1.getMaterial().compareTo(o2.getMaterial());
                    else return o1.getBottle().compareTo(o2.getBottle());
                }
            });
            writeToFile(fileToWrite, bottlesList.toString());
        }
        if (sortType == 3) {
            Collections.sort(bottlesList, new Comparator<Bottle>() {
                @Override
                public int compare(Bottle o1, Bottle o2) {
                    if (o1.getMaterial().compareTo(o2.getMaterial()) != 0)
                        return o1.getMaterial().compareTo(o2.getMaterial());
                    if (o1.getVolume().compareTo(o2.getVolume()) != 0)
                        return o1.getVolume().compareTo(o2.getVolume());
                    else return o1.getBottle().compareTo(o2.getBottle());
                }
            });
            writeToFile(fileToWrite, bottlesList.toString());
        }
    }
}

