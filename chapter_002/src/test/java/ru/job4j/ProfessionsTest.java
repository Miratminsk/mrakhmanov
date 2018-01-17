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
    public void whenTestDoctor() {
        Doctor doctor = new Doctor(30, 'M', "BSU", "Chicago Hospital", "Mirat", "Alex");
        String resultArrayOne = doctor.getJob(doctor);
        char resultArrayTwo = doctor.getGender();
        String resultArrayThree = doctor.getEducation();
        int resultArrayFour = doctor.getAge();
        String resultArrayFive = doctor.treat(doctor);
        String resultArraySix = doctor.getDoctorName(doctor);
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
    public void whenTestEngineer() {
        Engineer engineer = new Engineer(50, 'W', "MSU", 159357, "Mary", "Bob");
        int resultArrayOne = engineer.getLicenseNo(engineer);
        char resultArrayTwo = engineer.getGender();
        String resultArrayThree = engineer.getEducation();
        int resultArrayFour = engineer.getAge();
        String resultArrayFive = engineer.getInspects(engineer);
        String resultArraySix = engineer.getEngineerName(engineer);
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
    public void whenTestTeacher() {
        Teacher teacher = new Teacher(40, 'M', "ISU", "Hight", "Anna", "Phil");
        String resultArrayOne = teacher.getExperience(teacher);
        char resultArrayTwo = teacher.getGender();
        String resultArrayThree = teacher.getEducation();
        int resultArrayFour = teacher.getAge();
        String resultArrayFive = teacher.getTeaches(teacher);
        String resultArraySix = teacher.getTeacherName(teacher);
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