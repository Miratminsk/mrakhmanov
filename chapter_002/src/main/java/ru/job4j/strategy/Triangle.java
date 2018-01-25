package ru.job4j.strategy;

/**
 * @author      Mirat Rakhmanov
 * @since       24.01.2018
 * @version     1.0
 */

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("    +    ");
        pic.append(System.lineSeparator());
        pic.append("   +++   ");
        pic.append(System.lineSeparator());
        pic.append("  +++++  ");
        pic.append(System.lineSeparator());
        pic.append(" +++++++ ");
        pic.append(System.lineSeparator());
        pic.append("+++++++++");
        return pic.toString();
    }
}