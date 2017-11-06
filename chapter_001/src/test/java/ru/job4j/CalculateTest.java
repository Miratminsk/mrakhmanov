package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author     Mirat Rakhmanov
 * @since      02.11.2017
 * @version    1.0
 */
public class CalculateTest {
	/**
	 * Test echo.
	 */
	@Test
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Mirat Rakhmanov";
		String expect = "Echo, echo, echo : Mirat Rakhmanov";
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
}