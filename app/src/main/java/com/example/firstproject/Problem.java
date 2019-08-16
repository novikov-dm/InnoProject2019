package com.example.firstproject;

import java.util.Random;

public class Problem { //что есть, условие
    private String requirement = "На счету Машиного мобильного телефона было %d рубля, а после разговора с Леной осталось %d рублей." +
            "Сколько минут длился разговор с Леной, если одна минута разговора стоит %d рубля %d копеек?";

    private double userAnswer;



    private int min1 = 50;
    private int max1 = 100;
    private int dif1 = max1 - min1;
    Random random1 = new Random();
    private int money1 = random1.nextInt(dif1) + min1;

    private int min2 = 5;
    private int max2 = 20;
    private int dif2 = max2 - min2;
    Random random2 = new Random();
    private int money2 = random2.nextInt(dif2) + min2;

    private int min3 = 150;
    private int max3 = 250;
    private int dif3 = max3 - min3;
    Random random3 = new Random();
    private int price = random3.nextInt(dif3) + min3;

     int result = (money1-money2)/price;

    public String getRequirement() {
        return String.format(requirement, money1, money2, price/100, price%100);
    }

    public void setUserAnswer(double answer) {
        this.userAnswer = answer;
    }

    public boolean getVerdict() {
        return userAnswer == result;
    }
}
