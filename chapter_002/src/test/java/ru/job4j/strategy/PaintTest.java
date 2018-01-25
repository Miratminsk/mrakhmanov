package ru.job4j.strategy;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author     Mirat Rakhmanov
 * @since      24.01.2018
 * @version    1.0
 */

public class PaintTest {

    @Test
    public void whenTestDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("++++++++")
                                .append(System.lineSeparator())
                                .append("+      +")
                                .append(System.lineSeparator())
                                .append("+      +")
                                .append(System.lineSeparator())
                                .append("+      +")
                                .append(System.lineSeparator())
                                .append("++++++++")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        System.setOut(stdout);
    }

    @Test
    public void whenTestDrawTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("    +    ")
                                .append(System.lineSeparator())
                                .append("   +++   ")
                                .append(System.lineSeparator())
                                .append("  +++++  ")
                                .append(System.lineSeparator())
                                .append(" +++++++ ")
                                .append(System.lineSeparator())
                                .append("+++++++++")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        System.setOut(stdout);
    }
}
