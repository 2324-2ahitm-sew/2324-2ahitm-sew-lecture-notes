package at.htlleonding;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static final String FILE_NAME = "names.txt";

    public static void main(String[] args) {

        // diese Klasse kann leer bleiben

        //buildString();
        //scanFile();

        Placeholder placeholder = new Placeholder();
        //System.out.println(placeholder.countLines(new File(FILE_NAME)));
        //String[] lines = placeholder.readFile(FILE_NAME);
        //System.out.println(Arrays.toString(lines));
        //writeFile();
        try {
            Files.copy(Path.of("mach-mir-mut.ovic"), Path.of("abc.ivic"));
        } catch (IOException e) {
            System.err.println(e.getMessage() + " nicht vorhanden");
        }
    }

    public static void buildString() {

        long start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 1000_000; i++) {

            sb.append("a");
        }
        String s = sb.toString();
        long end1 = System.nanoTime();
        System.out.println(s.length());
        System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));

    }

    public static void scanKeyboard() {

        Scanner scanner = new Scanner(System.in);

        //...

    }

    public static void scanFile() {

        try (Scanner scanner = new Scanner(new FileReader(FILE_NAME))) {
            while (scanner.hasNextLine()) {
                System.out.print(scanner.nextLine());
                System.out.print("-");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
            //System.err.println(e.getMessage());
        }

    }

    public static void writeFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("mach-mir-mut.ovic"))) {
            writer.println("Seppl did it again!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}