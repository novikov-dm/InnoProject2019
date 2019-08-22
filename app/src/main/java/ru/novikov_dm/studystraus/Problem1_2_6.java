package ru.novikov_dm.studystraus;

public class Problem1_2_6 extends Problem {
    private String requirement = "Шоколадка стоит %d рублей. В воскресенье в супермаркете действует специальное " +
            "предложение: заплатив за две шоколадки, покупатель получает три (одну в подарок). " +
            "Какое наибольшее количество шоколадок можно получить, потратив не более %d рублей в воскресенье?";


    private int min1 = 18;
    private int max1 = 300;
    private int dif1 = max1 - min1;
    private int price = (random.nextInt(dif1) + min1);

    private int min2 = 50;
    private int max2 = 100;
    private int dif2 = max2 - min2;
    private int money = (random.nextInt(dif2) + min2) * 10;


    private int result = money / price + (money/price/2);


    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, price, money);
    }
}
