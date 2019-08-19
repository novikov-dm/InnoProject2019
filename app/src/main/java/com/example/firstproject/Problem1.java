package com.example.firstproject;

public class Problem1 extends Problem {
    private String requirement1 = "Килограмм орехов стоит %d рублей. Маша купила %d кг %d г орехов. " +
            "Сколько рублей сдачи она должна получить с %d рублей?";
    private String requirement2 = "Летом килограмм клубники стоит %d рублей. Мама купила %d кг %d г клубники." +
            " Сколько рублей сдачи она получит с %d рублей?";

    private String[] requirements = {requirement1, requirement2};

    private double userAnswer;

    private int min1 = 5;
    private int max1 = 15;
    private int dif1 = max1 - min1;
    private int price = (random.nextInt(dif1) + min1) * 10;

    private int min2 = 10;
    private int max2 = 50;
    private int dif2 = max2 - min2;
    private int weight = (random.nextInt(dif2) + min2) * 100;

    private int min3 = 1;
    private int max3 = 10;
    private int dif3 = max3 - min3;
    private int result1 = random.nextInt(dif3) + min3;

    private int money = 50*(int)Math.ceil((weight * price / 1000 + result1)/50.0);
    private int result = money - weight * price / 1000;

    @Override
    public String getResult(){
        return String.valueOf(result);
    }

    private int n = random.nextInt(requirements.length);

    @Override
    public String getRequirement() {
        return String.format(requirements[n], price, weight / 1000, weight % 1000, money);
    }
}