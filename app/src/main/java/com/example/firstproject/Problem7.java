package com.example.firstproject;

import java.util.Random;

public class Problem7 extends Problem {
    private String requirement1 = "Показания счётчика электроэнергии 1 ноября составляли %d кВт•ч," +
            " а 1 декабря — %d кВт•ч. Сколько нужно заплатить за электроэнергию за ноябрь," +
            " если 1 кВт•ч электроэнергии стоит %d рубль %d копеек? Ответ дайте в рублях.";
    private String requirement2 = "В квартире, где проживает Алексей, установлен прибор учёта расхода холодной воды " +
            "(счётчик). 1 сентября счётчик показывал расход %d куб. м воды, а 1 октября — %d куб. м. " +
            "Какую сумму должен заплатить Алексей за холодную воду за сентябрь, " +
            "если цена 1 куб. м холодной воды составляет %d руб. %d коп.? Ответ дайте в рублях.";
    private String requirement3 = "В квартире установлен прибор учёта расхода холодной воды (счётчик). " +
            "Показания счётчика 1 июля составляли %d куб. м воды, а 1 августа — %d куб. м. " +
            "Сколько нужно заплатить за холодную воду за июль, " +
            "если стоимость 1 куб. м холодной воды составляет %d руб. %d коп.? Ответ дайте в рублях. ";

    private String[] requirements = {requirement1, requirement2, requirement3};

    private int min1 = 3000;
    private int max1 = 5000;
    private int dif1 = max1 - min1;
    Random random = new Random();
    private int month_1 = random.nextInt(dif1) + min1;

    private int min2 = 100;
    private int max2 = 500;
    private int dif2 = max2 - min2;
    private int result1 = random.nextInt(dif2) + min2;

    private int min3 = 200;
    private int max3 = 2500;
    private int dif3 = max3 - min3;
    private int price = random.nextInt(dif3) + min3;

    private int month_2 = month_1 + result1;
    private double result = (month_2 - month_1) * price / 100;

    private int n = random.nextInt(requirements.length);

    @Override
    public String getRequirement() {
        return String.format(requirements[n], month_1, month_2, price / 100, price % 100);
    }
}