package ru.novikov_dm.studystraus;

public class Problem1_3_5 extends Problem {
    private String requirement = "Для ремонта квартиры требуется %d рулона обоев. " +
            "Сколько пачек обойного клея нужно купить, если одна пачка клея рассчитана на %d рулонов?";

    private int min1 = 50;
    private int max1 = 150;
    private int dif1 = max1 - min1;
    private int count_1 = (random.nextInt(dif1) + min1);

    private int min2 = 5;
    private int max2 = 30;
    private int dif2 = max2 - min2;
    private int count_2 = random.nextInt(dif2) + min2;

    private int result = (int) Math.ceil(count_1 / (count_2 * 1.0));


    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, count_1, count_2);
    }
}