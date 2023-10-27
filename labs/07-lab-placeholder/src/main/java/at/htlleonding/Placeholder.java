package at.htlleonding;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Placeholder {

    final String TEMPLATE_FILENAME = "template.txt";
    final String NAMES_FILENAME = "names.txt";
    final String RESULT_FILENAME = "result.txt";

    /**
     * @param filename
     * @return all lines of the file with 'filename'
     */
    public String[] readFile(String filename) {

        File file = new File(filename);
        String[] lines = new String[countLines(file)];

        try (Scanner scanner = new Scanner(new FileReader(file))) {
            for (int i = 0; scanner.hasNextLine(); i++) {
                lines[i] = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return lines;
    }

    int countLines(File file) {

        try (Scanner sc = new Scanner(new FileReader(file))) {
            int noOfLines = 0;
            while (sc.hasNextLine()) {
                sc.nextLine();
                noOfLines++;
            }
            return noOfLines;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public String[] insertData(String[] template, String[] names) {
        String[] result = new String[template.length * names.length];

        // 1. Alle Template Zeilen werden durchlaufen
        //         Für jede Template Zeile wird ein Name eingesetzt und im result-String-Array gespeichert
        // 2. Das result-Array wird zurückgegeben.

        for (int i = 0; i < template.length; i++) {
            for (int j = 0; j < names.length; j++) {

                xy = template[1].replace("%1", "xy")
            }
        }

        return null;
    }

    public void writeFile(String filename, String[] lines) {

    }

}
