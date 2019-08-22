package ru.novikov_dm.studystraus;

public class Problem1_5_5 extends Problem {
    private String requirement = "Студент получил свой первый гонорар в размере %d рублей за выполненный перевод. " +
            "Он решил на все полученные деньги купить букет тюльпанов для своей учительницы английского языка. " +
            "Какое наибольшее количество тюльпанов сможет купить студент, если удержанный у него налог на доходы составляет " +
            "13%% гонорара, тюльпаны стоят %d рублей за штуку и букет должен состоять из нечетного числа цветов?";

    private int min1 = 5;
    private int max1 = 10;
    private int dif1 = max1 - min1;
    private int money = (random.nextInt(dif1) + min1) * 100;

    private int min2 = 1;
    private int max2 = 3;
    private int dif2 = max2 - min2;
    private int count = 2 * (random.nextInt(dif2) + min2) + 1;

    private int price = 5 * (int)Math.floor(money * 0.87 / count / 5.0);

    private int result = (int)(money * 0.87 / price);


    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, money, price);
    }
}