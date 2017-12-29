package ru.job4j;

/**
 * Класс для реализации Doctor в коде
 * @param       age, gender, education, job, name, doctorName
 * @author      Mirat Rakhmanov
 * @since       28.12.2017
 * @version     1.0
 * @return      age, gender, education, job, name, doctorName, кого лечит доктор
 */

public class Doctor extends Professions {
    public String job;
    public String treat;
    public String doctorName;

    public Doctor(int age, char gender, String education, String job, String name, String doctorName) {
        super(age, gender, education, name);
        this.job = job;
        this.doctorName = doctorName;
        this.treat = null;
    }
    public String getJob() {
        return this.job;
    }

    public String getDoctorName() {
        return this.doctorName;
    }
    public String treat() {
        String resultName = super.getName();
        String resultDoctor = this.doctorName;
        return resultDoctor + " " + "treats" + " " + resultName;
    }
}