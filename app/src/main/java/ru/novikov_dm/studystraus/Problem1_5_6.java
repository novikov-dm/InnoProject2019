package ru.novikov_dm.studystraus;

public class Problem1_5_6 extends Problem {
    private String requirement = "Футболка стоила %d рублей. Затем цена была снижена на %d%%. " +
            "Сколько рублей сдачи с %d рублей должен получить покупатель при покупке этой футболки после снижения цены?";

    private int min1 = 5;
    private int max1 = 10;
    private int dif1 = max1 - min1;
    private int price = (random.nextInt(dif1) + min1) * 100;

    private int min2 = 2;
    private int max2 = 5;
    private int dif2 = max2 - min2;
    private int percent = (random.nextInt(dif2) + min2) * 5;

    private int min3 = 10;
    private int max3 = 15;
    private int dif3 = max3 - min3;
    private int money = (random.nextInt(dif3) + min3) * 100;

    private int result = (money - price * (100 - percent) / 100);


    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, price, percent, money);
    }
}