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
    private String experience;
    private String teacherName;
    public String teaches;

    public Teacher(int age, char gender, String education, String experience, String name, String teacherName) {
        super(age, gender, education, name);
        this.experience = experience;
        this.teacherName = teacherName;
        this.teaches = null;
    }
    public String getExperience(Teacher teacher) {
        return this.experience;
    }

    public String getTeacherName(Teacher teacher) {
        return this.teacherName;
    }
    public String getTeaches(Teacher teacher) {
        String resultName = super.getName();
        String resultTeacher = this.teacherName;
        return resultTeacher + " " + "teaches" + " " + resultName;
    }
}