package ru.novikov_dm.studystraus;

public class Problem8 extends Problem {
    private String requirement = "Маша отправила SMS-сообщения с новогодними поздравлениями своим %d друзьям. " +
            "Стоимость одного SMS-сообщения %d руб. Перед отправкой сообщения на счету у Маши было %d рублей." +

            " Сколько рублей останется у Маши после отправки всех сообщений?";

    private int min1 = 5;
    private int max1 = 25;
    private int dif1 = max1 - min1;

    private int count = random.nextInt(dif1) + min1;


    private int min2 = 3;
    private int max2 = 5;

    private int dif2 = max2 - min2;
    private int price = random.nextInt(dif2) + min2;

    private int min3 = 0;
    private int max3 = 15;
    private int dif3 = max3 - min3;
    private int result1 = random.nextInt(dif3) + min3;

    private int money = count * price + result1;

    private double result = money - count * price;

    @Override
    public String getResult(){
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, count, price, money);
    }
}