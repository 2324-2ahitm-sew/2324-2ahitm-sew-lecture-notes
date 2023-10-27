package at.htlleonding;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.File;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PlaceholderTest {

    @Test
    @Order(1000)
    void testReadFile() {

        Placeholder placeholder = new Placeholder();

        String[] names = placeholder.readFile(placeholder.NAMES_FILENAME);

        assertThat(names)
                .hasSize(10)
                .containsExactly(
                        "Anton",
                        "Berta",
                        "Cäsar",
                        "Dora",
                        "Emil",
                        "Friedrich",
                        "Gustav",
                        "Heinrich",
                        "Ida",
                        "Julius"
                );
    }

    @Test
    @Order(1010)
    void testCountLinesWith10Elements() {
        // arrange
        int expectedNoOfLines = 10;
        Placeholder placeholder = new Placeholder();

        // act
        File file = new File(placeholder.NAMES_FILENAME);
        int actualNoOfLines = placeholder.countLines(file);

        // assert
        assertThat(actualNoOfLines).isEqualTo(expectedNoOfLines);
    }

    @Test
    @Order(1020)
    void testCountLinesWith1Element() {
        // arrange
        int expectedNoOfLines = 1;
        Placeholder placeholder = new Placeholder();

        // act
        File file = new File(placeholder.TEMPLATE_FILENAME);
        int actualNoOfLines = placeholder.countLines(file);

        // assert
        assertThat(actualNoOfLines).isEqualTo(expectedNoOfLines);
    }

    @Test
    @Order(1030)
    void testCountLinesWithEmptyFile() {
        // arrange
        int expectedNoOfLines = 0;
        Placeholder placeholder = new Placeholder();

        // act
        File file = new File("empty_file.txt");
        int actualNoOfLines = placeholder.countLines(file);

        // assert
        assertThat(actualNoOfLines).isEqualTo(expectedNoOfLines);
    }

    @Test
    @Order(1040)
    void testinsertData() {
        //arrange
        Placeholder placeholder = new Placeholder();
        String[] template = placeholder.readFile(placeholder.TEMPLATE_FILENAME);
        String[] names = placeholder.readFile(placeholder.NAMES_FILENAME);

        // act
        String[] result = placeholder.insertData(template, names);

        // assert
        assertThat(result).hasSize(10);
    }

    @Test
    @Order(1050)
    void testinsertDataWithTwoTemplateLines() {
        //arrange
        Placeholder placeholder = new Placeholder();
        String[] template = placeholder.readFile("template2.txt");
        String[] names = placeholder.readFile(placeholder.NAMES_FILENAME);

        // act
        String[] result = placeholder.insertData(template, names);

        // assert
        assertThat(result)
                .hasSize(20)
                .contains(
                        "In den Ferien macht Anton mal Pause.",
                        "In den Ferien macht Berta mal Pause.",
                        "Während der Schulzeit lernt Anton.",
                        "Während der Schulzeit lernt Berta."
                );
    }

    @Test
    @Order(1060)
    void testWriteFile() {
        //arrange
        Placeholder placeholder = new Placeholder();
        String[] template = placeholder.readFile("template2.txt");
        String[] names = placeholder.readFile(placeholder.NAMES_FILENAME);
        String[] result = placeholder.insertData(template, names);
        File actualFile = Paths.get(placeholder.RESULT_FILENAME).toFile();
        File expectedFile = new File("result-final.txt");

        // act
        placeholder.writeFile(placeholder.RESULT_FILENAME, result);

        // assert
        //https://gist.github.com/bcalmac/16de6b918222aa9ed5db
//        assertThat(linesOf(actualFile)).containsExactly(
//                "line 1",
//                "line 2",
//                "line 3"
//        );
        assertThat(actualFile).hasSameBinaryContentAs(expectedFile);
    }

}
