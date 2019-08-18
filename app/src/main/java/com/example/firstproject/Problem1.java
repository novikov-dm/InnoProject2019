package com.example.firstproject;

import java.util.Random;

public class Problem1 extends Problem {
    private String requirement1 = "Килограмм орехов стоит %d рублей. Маша купила %d кг %d г орехов. " +
            "Сколько рублей сдачи она должна получить с %d рублей?";
    private String requirement2 = "Летом килограмм клубники стоит %d рублей. Мама купила %d кг %d г клубники." +
            " Сколько рублей сдачи она получит с %d рублей?";

    private String[] requirements = {requirement1, requirement2};

    private int min1 = 50;
    private int max1 = 200;
    private int dif1 = max1 - min1;
    Random random = new Random();
    private int price = random.nextInt(dif1) + min1;

    private int min2 = 1000;
    private int max2 = 5000;
    private int dif2 = max2 - min2;
    private int weight = random.nextInt(dif2) + min2;

    private int min3 = 0;
    private int max3 = 100;
    private int dif3 = max3 - min3;
    private int result1 = random.nextInt(dif3) + min3;

    private int money = weight * price / 1000 + result1;
    private double result = money - weight * price / 1000;

    private int n = random.nextInt(requirements.length);

    @Override
    public String getRequirement() {
        return String.format(requirements[n], price, weight / 1000, weight % 1000, money);
    }
}