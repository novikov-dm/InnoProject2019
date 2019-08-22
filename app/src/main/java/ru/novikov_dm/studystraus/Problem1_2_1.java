package ru.novikov_dm.studystraus;

public class Problem1_2_1 extends Problem {
    private String requirement = "В обменном пункте 1 грвн. стоит 2 рубля 65 копеек. " +
            "Отдыхающие обменяли рубли на гривны и купили %d кг помидоров по цене %d гривны за 1 кг. " +
            "Во сколько рублей обошлась им эта покупка? Ответ округлите до целого числа.";

    private int min1 = 2;
    private int max1 = 5;
    private int dif1 = max1 - min1;
    private int count = random.nextInt(dif1) + min1;

    private int min2 = 24;
    private int max2 = 50;
    private int dif2 = max2 - min2;
    private int price = random.nextInt(dif2) + min2;

    private double result = Math.round(count * price * 2.65);

    @Override
    public String getResult(){
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, count, price);
    }
}
