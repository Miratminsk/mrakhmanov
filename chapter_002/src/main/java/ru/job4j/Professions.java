package ru.job4j;

/**
 * Класс для реализации профессий в коде
 * @param      age, gender, education, name
 * @author     Mirat Rakhmanov
 * @since      28.12.2017
 * @version    1.0
 * @return     age, gender, education, name
 */

public class Professions {
    public int age;
    public char gender;
    public String education;
    public String name;

    public Professions(int age, char gender, String education, String name) {
        this.age = age;
        this.gender = gender;
        this.education = education;
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }

    public String getEducation() {
        return this.education;
    }
    public String getName() {
        return this.name;
    }
}