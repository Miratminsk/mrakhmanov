package ru.job4j.strategy;

/**
 * @author      Mirat Rakhmanov
 * @since       24.01.2018
 * @version     1.0
 */

    public class Paint {
        public void draw(Shape shape) {
            System.out.println(shape.draw());
        }

        public static void main(String[] args) {
            new Paint().draw(new Triangle());
            new Paint().draw(new Square());
        }
}