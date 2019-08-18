package com.example.firstproject;

import java.util.Random;

public class Problem8 extends Problem {
    private String requirement = "Маша отправила SMS-сообщения с новогодними поздравлениями своим %d друзьям. " +
            "Стоимость одного SMS-сообщения %d рубль %d копеек. Перед отправкой сообщения на счету у Маши было %d рублей." +
            " Сколько рублей останется у Маши после отправки всех сообщений?";

    private int min1 = 5;
    private int max1 = 25;
    private int dif1 = max1 - min1;
    Random random = new Random();
    private int count = random.nextInt(dif1) + min1;


    private int min2 = 100;
    private int max2 = 500;
    private int dif2 = max2 - min2;
    private int price = random.nextInt(dif2) + min2;

    private int min3 = 0;
    private int max3 = 15;
    private int dif3 = max3 - min3;
    private int result1 = random.nextInt(dif3) + min3;

    private int money = count * price / 100 + result1;

    private double result = money - count * price / 100;

    @Override
    public String getRequirement() {
        return String.format(requirement, count, price / 100, price % 100, money);
    }
}