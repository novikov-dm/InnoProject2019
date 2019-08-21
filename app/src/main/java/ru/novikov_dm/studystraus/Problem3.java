package ru.novikov_dm.studystraus;

public class Problem3 extends Problem {

    private String requirement = "Таксист за месяц проехал %d километров. Стоимость 1 литра бензина - %d рублей. " +

            "Средний расход бензина на 100 км составляет %d литров. Сколько рублей потратил таксист на бензин за этот месяц?";

    private double userAnswer;

    private int min1 = 10;
    private int max1 = 100;
    private int dif1 = max1 - min1;
    private int distance = (min1 + random.nextInt(dif1)) * 100;

    private int min2 = 3;
    private int max2 = 6;
    private int dif2 = max2 - min2;
    private int price = (min2 + random.nextInt(dif2)) * 10;

    private int min3 = 9;

    private int max3 = 15;
    private int dif3 = max3 - min3;
    private int volume = min3 + random.nextInt(dif3);

    private double result = (distance / 100.0) * price * volume;

    @Override
    public String getResult(){
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, distance, price, volume);
    }

}
