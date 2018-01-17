package ru.job4j;

/**
 * Класс для реализации Engineer в коде
 * @param       age, gender, education, licenseNo, name, engineerName
 * @author      Mirat Rakhmanov
 * @since       28.12.2017
 * @version     1.0
 * @return      age, gender, education, licenseNo, name, engineerName, кого инспектирует инженер
 */

public class Engineer extends Professions {
    private int licenseNo;
    private String engineerName;
    public String inspects;

    public Engineer(int age, char gender, String education, int licenseNo, String name, String engineerName) {
        super(age, gender, education, name);
        this.licenseNo = licenseNo;
        this.engineerName = engineerName;
        this.inspects = null;
    }
    public int getLicenseNo(Engineer engineer) {
        return this.licenseNo;
    }

    public String getEngineerName(Engineer engineer) {
        return this.engineerName;
    }
    public String getInspects(Engineer engineer) {
        String resultName = super.getName();
        String resultEngineer = this.engineerName;
        return resultEngineer + " " + "inspects" + " " + resultName;
    }
}