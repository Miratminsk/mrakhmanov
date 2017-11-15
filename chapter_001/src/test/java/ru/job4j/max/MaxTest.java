package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author     Mirat Rakhmanov
 * @since      09.11.2017
 * @version    1.0
 */
 
	public class MaxTest {
	
	@Test
	public void whenThirdIsMaxValue() {
	Max maxim = new Max();
	int result = maxim.max(1, 2, 3);
	assertThat(result, is(3));
	}
	@Test
	public void whenFirsIsMaxValue() {
	Max maxim = new Max();
	int result = maxim.max(6, 5, 4);
	assertThat(result, is(6));
	}
}