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
    private String job;
    private String doctorName;
    public String treat;

    public Doctor(int age, char gender, String education, String job, String name, String doctorName) {
        super(age, gender, education, name);
        this.job = job;
        this.doctorName = doctorName;
        this.treat = null;
    }
    public String getJob(Doctor doctor) {
        return this.job;
    }

    public String getDoctorName(Doctor doctor) {
        return this.doctorName;
    }
    public String treat(Doctor doctor) {
        String resultName = super.getName();
        String resultDoctor = this.doctorName;
        return resultDoctor + " " + "treats" + " " + resultName;
    }
}