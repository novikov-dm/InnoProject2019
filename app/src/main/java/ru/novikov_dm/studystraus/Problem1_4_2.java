package ru.novikov_dm.studystraus;

public class Problem1_4_2 extends Problem {
    private String requirement = "Цена на электрический чайник была повышена на %d%% и составила %d рублей. " +
            "Сколько рублей стоил чайник до повышения цены?";


    private int min1 = 10;
    private int max1 = 20;
    private int dif1 = max1 - min1;
    private int percent = random.nextInt(dif1) + min1;

    private int min2 = 5;
    private int max2 = 60;
    private int dif2 = max2 - min2;
    private int price1 = (random.nextInt(dif2) + min2) * 100;

    private int price = price1 * (100 + percent) / 100;

    private int result = price * 100 / (100 + percent);


    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, percent, price);
    }
}