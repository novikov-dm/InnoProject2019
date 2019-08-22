package ru.novikov_dm.studystraus;

public class Problem1_4_4 extends Problem {
    private String requirement = "Клиент взял в банке кредит %d рублей на год под %d%%. Он должен погашать кредит, " +
            "внося в банк ежемесячно одинаковую сумму денег, с тем чтобы через год выплатить всю сумму, взятую в кредит, " +
            "вместе с процентами. Сколько рублей он должен вносить в банк ежемесячно? Округлите до целого числа. ";

    private int min1 = 20;
    private int max1 = 100;
    private int dif1 = max1 - min1;
    private int money = (random.nextInt(dif1) + min1) * 1000;

    private int min2 = 10;
    private int max2 = 20;
    private int dif2 = max2 - min2;
    private int percent = random.nextInt(dif2) + min2;

    private int result = (int) Math.round(money * (100 + percent) / 100 / 12.0);

    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, money, percent);
    }
}