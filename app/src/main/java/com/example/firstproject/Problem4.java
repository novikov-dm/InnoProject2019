package com.example.firstproject;

import java.util.Random;
import java.lang.Math;

public class Problem4 extends Problem {
    private String requirement = "Павел Иванович купил американский автомобиль, " +
            "на спидометре которого скорость измеряется в милях в час. " +
            "Американская миля равна 1609 м. Какова скорость автомобиля в километрах в час, " +
            "если спидометр показывает %d миль в час? Ответ округлите до целого числа";

    private final int VALUE = 1609;
    private int min = 0;
    private int max = 270;
    private int dif = max - min;
    Random random = new Random();
    private int speed = random.nextInt(dif) + min;

    private double unrounded_result = speed * VALUE / 1000;
    private double result = (int) Math.round(unrounded_result);

    @Override
    public String getRequirement() {
        return String.format(requirement, speed);
    }
}