package ru.novikov_dm.studystraus;

public class Problem1_1_9 extends Problem{
    private String requirement = "Спидометр автомобиля показывает скорость в милях в час. " +
            "Какую скорость (в милях в час) показывает спидометр, если автомобиль движется со скоростью %d км в час? " +
            "(Считайте, что 1 миля равна 1,6 км.)";

    private final double VALUE = 1.6;

    private int min1 = 20;
    private int max1 = 100;
    private int dif1 = max1 - min1;
    private int speed = random.nextInt(dif1) + min1;

    private double result = speed / VALUE;

    @Override
    public String getResult(){
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, speed);
    }
}
