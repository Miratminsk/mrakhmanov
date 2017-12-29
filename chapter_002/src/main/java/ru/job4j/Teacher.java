package ru.job4j;

/**
 * Класс для реализации Teacher в коде
 * @param       age, gender, education, experience, name, teacherName
 * @author      Mirat Rakhmanov
 * @since       28.12.2017
 * @version     1.0
 * @return      age, gender, education, experience, name, teacherName, кого учит учитель
 */

public class Teacher extends Professions {
    public String experience;
    public String teaches;
    public String teacherName;

    public Teacher(int age, char gender, String education, String experience, String name, String teacherName) {
        super(age, gender, education, name);
        this.experience = experience;
        this.teacherName = teacherName;
        this.teaches = null;
    }
    public String getExperience() {
        return this.experience;
    }

    public String getTeacherName() {
        return this.teacherName;
    }
    public String getTeaches() {
        String resultName = super.getName();
        String resultTeacher = this.teacherName;
        return resultTeacher + " " + "teaches" + " " + resultName;
    }
}