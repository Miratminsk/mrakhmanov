package ru.job4j.strategy;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author     Mirat Rakhmanov
 * @since      24.01.2018
 * @version    1.0
 */

public class ShapeTest {

    @Test
    public void whenTestSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
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
                                .toString()
                )
        );
    }

    @Test
    public void whenTestTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
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
                                .toString()
                )
        );
    }
}

