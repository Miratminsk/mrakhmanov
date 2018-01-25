package ru.job4j.strategy;

import org.junit.After;
import org.junit.Before;
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
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenTestDrawSquare() {
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
    }

    @Test
    public void whenTestDrawTriangle() {
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
    }
}
