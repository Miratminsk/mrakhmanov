package ru.job4j;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author     Mirat Rakhmanov
 * @since      28.12.2017
 * @version    1.0
 */

public class ProfessionsTest {


    @Test
    public void whetTestDoctor() {
        Doctor doctor = new Doctor(30, 'M', "BSU", "Chicago Hospital", "Mirat", "Alex");
        String resultArrayOne = doctor.getJob();
        char resultArrayTwo = doctor.getGender();
        String resultArrayThree = doctor.getEducation();
        int resultArrayFour = doctor.getAge();
        String resultArrayFive = doctor.treat();
        String resultArraySix = doctor.getDoctorName();
        String expectArrayOne = "Chicago Hospital";
        char expectArrayTwo = 'M';
        String expectArrayThree = "BSU";
        int expectArrayFour = 30;
        String expectArrayFive = "Alex treats Mirat";
        String expectArraySix = "Alex";
        assertThat(resultArrayOne, is(expectArrayOne));
        assertThat(resultArrayTwo, is(expectArrayTwo));
        assertThat(resultArrayThree, is(expectArrayThree));
        assertThat(resultArrayFour, is(expectArrayFour));
        assertThat(resultArrayFive, is(expectArrayFive));
        assertThat(resultArraySix, is(expectArraySix));
    }
    @Test
    public void whetTestEngineer() {
        Engineer engineer = new Engineer(50, 'W', "MSU", 159357, "Mary", "Bob");
        int resultArrayOne = engineer.getLicenseNo();
        char resultArrayTwo = engineer.getGender();
        String resultArrayThree = engineer.getEducation();
        int resultArrayFour = engineer.getAge();
        String resultArrayFive = engineer.getScold();
        String resultArraySix = engineer.getEngineerName();
        int expectArrayOne = 159357;
        char expectArrayTwo = 'W';
        String expectArrayThree = "MSU";
        int expectArrayFour = 50;
        String expectArrayFive = "Bob inspects Mary";
        String expectArraySix = "Bob";
        assertThat(resultArrayOne, is(expectArrayOne));
        assertThat(resultArrayTwo, is(expectArrayTwo));
        assertThat(resultArrayThree, is(expectArrayThree));
        assertThat(resultArrayFour, is(expectArrayFour));
        assertThat(resultArrayFive, is(expectArrayFive));
        assertThat(resultArraySix, is(expectArraySix));
    }
    @Test
    public void whetTestTeacher() {
        Teacher teacher = new Teacher(40, 'M', "ISU", "Hight", "Anna", "Phil");
        String resultArrayOne = teacher.getExperience();
        char resultArrayTwo = teacher.getGender();
        String resultArrayThree = teacher.getEducation();
        int resultArrayFour = teacher.getAge();
        String resultArrayFive = teacher.getTeaches();
        String resultArraySix = teacher.getTeacherName();
        String expectArrayOne = "Hight";
        char expectArrayTwo = 'M';
        String expectArrayThree = "ISU";
        int expectArrayFour = 40;
        String expectArrayFive = "Phil teaches Anna";
        String expectArraySix = "Phil";
        assertThat(resultArrayOne, is(expectArrayOne));
        assertThat(resultArrayTwo, is(expectArrayTwo));
        assertThat(resultArrayThree, is(expectArrayThree));
        assertThat(resultArrayFour, is(expectArrayFour));
        assertThat(resultArrayFive, is(expectArrayFive));
        assertThat(resultArraySix, is(expectArraySix));
    }
}