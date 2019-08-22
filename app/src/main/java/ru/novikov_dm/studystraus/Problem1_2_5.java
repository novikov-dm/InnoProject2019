package ru.novikov_dm.studystraus;

public class Problem1_2_5 extends Problem {
    private String requirement = "Сырок стоит %d руб. %d коп. Какое наибольшее число сырков можно купить на %d рублей?";


    private int min1 = 100;
    private int max1 = 300;
    private int dif1 = max1 - min1;
    private int price = (random.nextInt(dif1) + min1) * 10;

    private int min2 = 10;
    private int max2 = 100;
    private int dif2 = max2 - min2;
    private int money = (random.nextInt(dif2) + min2) * 10;


    private int result = (int) Math.floor(money / (price / 100.0));


    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, price / 100, price % 100, money);
    }
}