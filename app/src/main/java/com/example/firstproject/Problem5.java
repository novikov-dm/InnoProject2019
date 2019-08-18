package com.example.firstproject;

import java.util.Random;

public class Problem5 extends Problem {
    private String requirement = "На счету Машиного мобильного телефона было %d рубля, а после разговора с Леной осталось %d рублей." +
            "Сколько минут длился разговор с Леной, если одна минута разговора стоит %d рубля %d копеек?";

    private int min1 = 50;
    private int max1 = 100;
    private int dif1 = max1 - min1;
    Random random = new Random();
    private int money1 = random.nextInt(dif1) + min1;


    private int min2 = 5;
    private int max2 = 20;
    private int dif2 = max2 - min2;
    private int money2 = random.nextInt(dif2) + min2;

    private int min3 = 150;
    private int max3 = 250;
    private int dif3 = max3 - min3;
    private int price = random.nextInt(dif3) + min3;

    private double result = (money1 - money2) / price * 100;

    @Override
    public String getRequirement() {
        return String.format(requirement, money1, money2, price / 100, price % 100);
    }

}
