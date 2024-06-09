package app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    private final static String BASE_PATH = "files";
    String fileName = "fileName" ;
    public String writeFile(String fileContent ) {

        try(FileWriter fw =
                    new FileWriter(fileName + ".txt")) {
            fw.write(fileContent);
            return "Success.";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String readFile(String path) {
        try (FileReader reader = new FileReader(fileName)) {
            int sym;
            StringBuilder stringBuilder = new StringBuilder();
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            return writeFile(fileName + ".txt");
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }}