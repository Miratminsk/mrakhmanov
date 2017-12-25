package ru.job4j.examone;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author     Mirat Rakhmanov
 * @since      25.12.2017
 * @version    1.0
 */

public class ExamOneTest {

    @Test
    public void whenExamOneContainsWordInTheMiddle() {
        ExamOne words = new ExamOne();
        String origin = "метоксихлордиэтиламинометилбутиламиноакридин";
        String sub = "ТИЛАМИН";
        boolean resultOrigin = words.contains(origin, sub);
        assertThat(resultOrigin, is(true));
    }
    @Test
    public void whenExamOneContainsWordAtTheEnd() {
        ExamOne words = new ExamOne();
        String origin = "МирАт";
        String sub = "рат";
        boolean resultOrigin = words.contains(origin, sub);
        assertThat(resultOrigin, is(true));
    }
    @Test
    public void whenExamOneContainsWordAtTheBeginning() {
        ExamOne words = new ExamOne();
        String origin = "дома";
        String sub = "Дом";
        boolean resultOrigin = words.contains(origin, sub);
        assertThat(resultOrigin, is(true));
    }
    @Test
    public void whenExamOneDoNotContainsWord() {
        ExamOne words = new ExamOne();
        String origin = "ЕЛКА";
        String sub = "Дом";
        boolean resultOrigin = words.contains(origin, sub);
        assertThat(resultOrigin, is(false));
    }
 }