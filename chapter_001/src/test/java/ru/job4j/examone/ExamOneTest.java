package ru.job4j.examone;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author     Mirat Rakhmanov
 * @since      14.12.2017
 * @version    1.0
 */

public class ExamOneTest {

    @Test
    public void whenExamOneLongWordContainsShortWord() {
        ExamOne words = new ExamOne();
        String origin = "метоксихлордиэтиламинометилбутиламиноакридин";
        String sub = "акридин";
        boolean resultOrigin = words.contains(origin, sub);
        assertThat(resultOrigin, is(true));
            }
    @Test
    public void whenExamOneWordDoNotContainsWord() {
        ExamOne words = new ExamOne();
        String origin = "Елка";
        String sub = "Дом";
        boolean resultOrigin = words.contains(origin, sub);
        assertThat(resultOrigin, is(false));
    }
 }