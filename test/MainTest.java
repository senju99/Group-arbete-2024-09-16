package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Main;

import org.junit.jupiter.api.BeforeEach;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testKebabpizzaChoice() {
        String input = "1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(new String[]{});
        assertTrue(outputStreamCaptor.toString().contains("Din favorit mat är Kebabpizza"));
    }

    @Test
    public void testPastaChoice() {
        String input = "2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(new String[]{});
        assertTrue(outputStreamCaptor.toString().contains("Din favorit mat är Pasta"));
    }

    @Test
    public void testKebabtallrikChoice() {
        String input = "3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(new String[]{});
        assertTrue(outputStreamCaptor.toString().contains("Din favorit mat är Kebabtallrik"));
    }

    @Test
    public void testHusmanskostChoice() {
        String input = "4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(new String[]{});
        assertTrue(outputStreamCaptor.toString().contains("Din favorit mat är Husmanskost"));
    }

    @Test
    public void testMaxHamburgareChoice() {
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(new String[]{});
        assertTrue(outputStreamCaptor.toString().contains("Din favorit mat är Max Hamburgare"));
    }

    @Test
    public void testSushiChoice() {
        String input = "6\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(new String[]{});
        assertTrue(outputStreamCaptor.toString().contains("Din favorit mat är Sushi"));
    }

    @Test
    public void testPadThaiChoice() {
        String input = "7\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(new String[]{});
        assertTrue(outputStreamCaptor.toString().contains("Din favorit mat är Pad Thai"));
    }

    @Test
    public void testInvalidChoice() {
        String input = "8\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(new String[]{});
        assertTrue(outputStreamCaptor.toString().contains("Det alternativet finns inte..."));
    }

    @Test
    public void testZeroChoice() {
        String input = "0\n1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(new String[]{});
        assertTrue(outputStreamCaptor.toString().contains("0 är fel val. Vad är din favorit mat?"));
        assertTrue(outputStreamCaptor.toString().contains("Din favorit mat är Kebabpizza"));
    }
}