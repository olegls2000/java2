package lesson19;

import data.Auto;

public class HomeWork {
    public static void main(String[] args) throws IllegalAccessException {
        MaxValueValidator maxValueValidator = new MaxValueValidator();
        Auto bmw = new Auto();
        Auto toyota = new Auto();
        toyota.setPrice(100_000 + 5);

        maxValueValidator.validateMaxValue(bmw);
        maxValueValidator.validateMaxValue(toyota);
    }
}
