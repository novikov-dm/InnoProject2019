package ru.novikov_dm.studystraus;

public class Problem1_3_2 extends Problem {
    private String requirement = "В летнем лагере на каждого участника полагается %d г сахара в день. " +
            "В лагере %d человек. Сколько килограммовых упаковок сахара понадобится на весь лагерь на %d дней?";


    private int min1 = 1;
    private int max1 = 5;
    private int dif1 = max1 - min1;
    private int sugar = (random.nextInt(dif1) + min1) * 10;

    private int min2 = 100;
    private int max2 = 500;
    private int dif2 = max2 - min2;
    private int people = random.nextInt(dif2) + min2;

    private int min3 = 5;
    private int max3 = 21;
    private int dif3 = max3 - min3;
    private int days = random.nextInt(dif3) + min3;

    private int result = (int) Math.ceil(sugar * people * days / 1000.0);


    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, sugar, people, days);
    }
}