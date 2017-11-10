package ru.job4j.calculator;

/**
* Класс для создания "Элементарного калькулятора"
* @author     Mirat Rakhmanov
* @since      09.11.2017
* @version    1.0
* Methods add,subtract,div,multiple 
* @param name Метод складывает (вычитает, умножает, делит) аргумент first и second и записывать результат в поле this.result.
*/

public class Calculator {
    private double result;

    public void add(double first, double second) {
        this.result = first + second;
    }
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    public void div(double first, double second) {
        this.result = first / second;
    }
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    public double getResult() {
        return this.result;
    }
}