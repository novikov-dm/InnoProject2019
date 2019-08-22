package ru.novikov_dm.studystraus;

public class Problem1_2_2 extends Problem {
    private String requirement = "По тарифному плану «Просто как день» компания сотовой связи каждый вечер снимает " +
            "со счёта абонента %d рублей. Если на счету осталось меньше %d рублей, " +
            "то на следующее утро номер блокируют до пополнения счёта. Сегодня утром у Лизы на счету было %d рублей. " +
            "Сколько дней (включая сегодняшний) она сможет пользоваться телефоном, не пополняя счёт?";

    private int min1 = 10;
    private int max1 = 20;
    private int dif1 = max1 - min1;
    private int price = random.nextInt(dif1) + min1;

    private int min2 = 10;
    private int max2 = 100;
    private int dif2 = max2 - min2;
    private int money = (random.nextInt(dif2) + min2) * 10;

    private double result = Math.floor(money / price);

    @Override
    public String getResult(){
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, price, price, money);
    }
}
