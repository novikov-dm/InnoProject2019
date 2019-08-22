package ru.novikov_dm.studystraus;

public class Problem1_5_1 extends Problem {
    private String requirement1 = "Флакон шампуня стоит %d рублей. Какое наибольшее число флаконов можно купить на " +
            "%d рублей во время распродажи, когда скидка составляет %d%% ?";
    private String requirement2 = "Тетрадь стоит %d рублей. Какое наибольшее число таких тетрадей можно будет купить на " +
            "%d рублей после понижения цены на %d%%?";

    private String[] requirements = {requirement1, requirement2};

    private int min1 = 20;
    private int max1 = 50;
    private int dif1 = max1 - min1;
    private int price = (random.nextInt(dif1) + min1) * 10;

    private int min2 = 10;
    private int max2 = 50;
    private int dif2 = max2 - min2;
    private int money = (random.nextInt(dif2) + min2) * 100;

    private int min3 = 1;
    private int max3 = 5;
    private int dif3 = max3 - min3;
    private int percent = (random.nextInt(dif3) + min3) * 5;

    private double result = (int)Math.floor(money / (price * (100 - percent) / 100));

    @Override
    public String getResult(){
        return String.valueOf(result);
    }

    private int n = random.nextInt(requirements.length);
    @Override
    public String getRequirement() {
        return String.format(requirements[n], price, money, percent);
    }
}
