package ru.novikov_dm.studystraus;

public class Problem1_1_10 extends Problem{
    private String requirement = "На автозаправке клиент отдал кассиру %d рублей и залил в бак " +
            "%d литров бензина по цене %d руб. %d коп. за литр. Сколько рублей сдачи он должен получить у кассира?";

    private int min1 = 20;
    private int max1 = 50;
    private int dif1 = max1 - min1;
    private int count = random.nextInt(dif1) + min1;

    private int min2 = 200;
    private int max2 = 500;
    private int dif2 = max2 - min2;
    private int price = (random.nextInt(dif2) + min2) * 10;

    private int min3 = 0;
    private int max3 = 500;
    private int dif3 = max3 - min3;
    private int result1 = random.nextInt(dif3) + min3;

    private int money = 50* (int)Math.ceil((count * price / 100.0 + result1) / 50.0);

    private double result = money - (count * price) / 100 ;

    @Override
    public String getResult(){
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, money, count, price / 100, price % 100);
    }
}