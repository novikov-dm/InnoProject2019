package ru.novikov_dm.studystraus;

public class Problem1_4_5 extends Problem {
    private String requirement = "Налог на доходы составляет 13%% от заработной платы. " +
            "Заработная плата Ивана Кузьмича равна %d рублей. Сколько рублей он получит после вычета налога на доходы?";

    private int min1 = 120;
    private int max1 = 250;
    private int dif1 = max1 - min1;
    private int money = (random.nextInt(dif1) + min1) * 100;

    private int result = money * 87 / 100;


    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, money);
    }
}