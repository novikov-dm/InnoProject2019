package ru.novikov_dm.studystraus;

public class Problem1_2_4 extends Problem {
    private String requirement1 = "Ананасы стоят %d руб. за штуку. Какое максимальное число ананасов можно купить " +
            "на %d руб., если их цена снизится на %d%%";
    private String requirement2 = "Стоимость проезда в маршрутном такси составляет %d руб. " +
            "Какое наибольшее число поездок можно будет совершить в этом маршрутном такси на %d руб., " +
            "если цена проезда снизится на %d%%?";

    private String[] requirements = {requirement1, requirement2};

    private int min1 = 5;
    private int max1 = 10;
    private int dif1 = max1 - min1;
    private int price = (random.nextInt(dif1) + min1) * 10;

    private int min2 = 10;
    private int max2 = 50;
    private int dif2 = max2 - min2;
    private int money = (random.nextInt(dif2) + min2) * 10;

    private int min3 = 10;
    private int max3 = 25;
    private int dif3 = max3 - min3;
    private int percent = 5 * (int)Math.ceil((random.nextInt(dif3) + min3)/5.0);

    private int result = (int) Math.floor(money / price * 100.0 / (100 - percent));


    @Override
    public String getResult() {
        return String.valueOf(result);
    }
    private int n = random.nextInt(requirements.length);
    @Override
    public String getRequirement() {
        return String.format(requirements[n], price, money, percent);
    }
}