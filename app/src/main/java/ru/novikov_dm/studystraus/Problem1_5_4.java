package ru.novikov_dm.studystraus;

public class Problem1_5_4 extends Problem {
    private String requirement = "Розничная цена учебника %d рублей, она на %d%% выше оптовой цены. " +
            "Какое наибольшее число таких учебников можно купить по оптовой цене на %d рублей?";

    private int min1 = 10;
    private int max1 = 30;
    private int dif1 = max1 - min1;
    private int price = (random.nextInt(dif1) + min1) * 10;

    private int min2 = 2;
    private int max2 = 4;
    private int dif2 = max2 - min2;
    private int percent = (random.nextInt(dif2) + min2) * 5;

    private int min3 = 5;
    private int max3 = 25;
    private int dif3 = max3 - min3;
    private int money = (random.nextInt(dif3) + min3) * 1000;

    private int result = (int) Math.floor(money / (price * 100.0 / (100 + percent)));


    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, price, percent, money);
    }
}