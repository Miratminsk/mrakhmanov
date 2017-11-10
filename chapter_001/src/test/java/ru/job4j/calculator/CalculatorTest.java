package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author     Mirat Rakhmanov
 * @since      09.11.2017
 * @version    1.0
 */

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	@Test
	public void whenDivTwoDivideTwoThenOne() {
        Calculator calc1 = new Calculator();
        calc1.div(2D, 2D);
        double result = calc1.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
	@Test
	public void whenSubtractThreeMinusTwoThenOne() {
        Calculator calc2 = new Calculator();
        calc2.subtract(3D, 2D);
        double result = calc2.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
	}
	@Test
	public void whenMultipleThreeMultiplyThreeThenNine() {
        Calculator calc3 = new Calculator();
        calc3.multiple(3D, 3D);
        double result = calc3.getResult();
        double expected = 9D;
        assertThat(result, is(expected));	
	}
}