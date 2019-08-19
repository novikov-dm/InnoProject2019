package com.example.firstproject;

public class Problem2 extends Problem {
    private String requirement1 = "Поезд Казань-Москва отправляется в %d:%s, " +
            "а прибывает в %d:%s на следующий день (время московское). Сколько часов поезд находится в пути?";
    private String requirement2 = "Поезд отправился из Санкт-Петербурга в %d часа %s минут " +
            "и прибыл в Москву в %d часов %s минут следующих суток. Сколько часов поезд находился в пути?";
    private String requirement3 = "Поезд Новосибирск-Красноярск отправляется в %d:%s, " +
            "а прибывает в %d:%s на следующий день (время московское). Сколько часов поезд находится в пути?";

    private String[] requirements = {requirement1, requirement2, requirement3};


    private final int MIDNIGHT = 24;
    private double userAnswer;

    private int min1 = 0;
    private int max1 = 144;
    private int dif1 = max1 - min1;
    private int departure_time = (random.nextInt(dif1) + min1) * 10;

    private int min2 = 0;
    private int max2 = 12;
    private int dif2 = max2 - min2;
    private int result1 = (random.nextInt(dif2) + min2);

    private int arrival_time = (departure_time + result1 * 60) % (24 * 60);
    private int result = MIDNIGHT - departure_time / 60 + arrival_time / 60;

    private int n = random.nextInt(requirements.length);

    @Override
    public String getResult(){
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        int min = departure_time % 60;
        return String.format(requirements[n], departure_time / 60, String.format("%d%d",min/10,min%10), arrival_time / 60, String.format("%d%d",min/10,min%10));
    }
}