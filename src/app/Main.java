package app;

public class Main {

    private final static String BASE_PATH = "C:\\HILLEL\\JavaPro\\Lesson10_03.06.2024\\Homework\\File-Handler_0.1\\files";

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String fileName = "myfile";
        String fileContent = "My very important information.";
        String result = handler.writeFile(fileContent);
        String content = handler.readFile( BASE_PATH + ".txt");
        getOutput("RESULT: " + result);
        getOutput("FILE CONTENT: " + content);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }

}
