package ru.novikov_dm.studystraus;

public class Problem1_5_3 extends Problem {
    private String requirement1 = "Магазин закупает цветочные горшки по оптовой цене %d рублей за штуку и продает с " +
            "наценкой %d%%. Какое наибольшее число таких горшков можно купить в этом магазине на %d рублей?";
    private String requirement2 = "Оптовая цена учебника %d рублей. Розничная цена на %d%% выше оптовой. " +
            "Какое наибольшее число таких учебников можно купить по розничной цене на %d рублей?";

    private String[] requirements = {requirement1, requirement2};

    private int min1 = 10;
    private int max1 = 30;
    private int dif1 = max1 - min1;
    private int price = (random.nextInt(dif1) + min1) * 10;

    private int min2 = 2;
    private int max2 = 5;
    private int dif2 = max2 - min2;
    private int percent = (random.nextInt(dif2) + min2) * 5;

    private int min3 = 1;
    private int max3 = 10;
    private int dif3 = max3 - min3;
    private int money = (random.nextInt(dif3) + min3) * 1000;

    private double result = (int)Math.floor(money / (price * (100 + percent) / 100.0));

    @Override
    public String getResult(){
        return String.valueOf(result);
    }

    private int n = random.nextInt(requirements.length);
    @Override
    public String getRequirement() {
        return String.format(requirements[n], price, percent, money);
    }
}
