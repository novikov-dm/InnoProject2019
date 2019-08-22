package ru.novikov_dm.studystraus;

public class Problem1_2_7 extends Problem {
    private String requirement = "На день рождения полагается дарить букет из нечетного числа цветов. " +
            "Тюльпаны стоят %d рублей за штуку. У Вани есть %d рублей. " +
            "Из какого наибольшего числа тюльпанов он может купить букет Маше на день рождения?";


    private int min1 = 7;
    private int max1 = 13;
    private int dif1 = max1 - min1;
    private int price = (random.nextInt(dif1) + min1) * 5;

    private int min2 = 1;
    private int max2 = 7;
    private int dif2 = max2 - min2;
    private int count = (random.nextInt(dif2) + min2) * 2 + 1;

    private int money = 10 * (int)Math.ceil((price * count + price)/ 10.0);

    private int result = (int) Math.floor(money / price);


    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, price, money);
    }
}