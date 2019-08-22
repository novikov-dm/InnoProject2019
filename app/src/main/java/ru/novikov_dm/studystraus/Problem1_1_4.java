package ru.novikov_dm.studystraus;

public class Problem1_1_4 extends Problem {
    private String requirement = "Павел Иванович купил американский автомобиль, " +
            "на спидометре которого скорость измеряется в милях в час. " +
            "Американская миля равна 1609 м. Какова скорость автомобиля в километрах в час, " +
            "если спидометр показывает %d миль в час? Ответ округлите до целого числа";

    private final int VALUE = 1609;
    private int min = 1;
    private int max = 5;
    private int dif = max - min;
    private int speed = (random.nextInt(dif) + min) * 10;

    private double unrounded_result = speed * VALUE / 1000.0;
    private double result = (int) Math.round(unrounded_result);

    @Override
    public String getResult(){
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, speed);
    }
}