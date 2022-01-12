package taskForFiles;

public class Main {

    public static void main(String[] args) {
        System.out.println(FilesController.readFromFile
                ("src/main/java/taskForFiles/bottles1.txt"));
        System.out.println("=================");
        System.out.println(FilesController.readFromFile
                ("src/main/java/taskForFiles/bottles2.txt"));
        System.out.println("=================");
        System.out.println(FilesController.readFromFile
                ("src/main/java/taskForFiles/bottles3.txt"));
        System.out.println("=================");
    }
}
