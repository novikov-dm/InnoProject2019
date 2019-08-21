package ru.novikov_dm.studystraus;


public class Problem5 extends Problem {
    private String requirement = "На счету Машиного мобильного телефона было %d руб., а после разговора с Леной осталось %d руб. " +
            "Сколько минут длился разговор с Леной, если одна минута разговора стоит %d руб.?";

    private int min1 = 3;
    private int max1 = 5;
    private int dif1 = max1 - min1;
    private int money1 = (random.nextInt(dif1) + min1)*10;


    private int min2 = 1;
    private int max2 = 2;
    private int dif2 = max2 - min2;
    private int money2 = (random.nextInt(dif2) + min2)*10;

    private int min3 = 1;
    private int max3 = 3;
    private int dif3 = max3 - min3;
    private int price = random.nextInt(dif3) + min3;

    private int result = (money1 - money2) / price;

    @Override
    public String getResult(){
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, money1, money2, price);
    }

}
