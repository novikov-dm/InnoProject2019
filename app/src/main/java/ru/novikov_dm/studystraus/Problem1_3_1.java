package ru.novikov_dm.studystraus;

public class Problem1_3_1 extends Problem {
    private String requirement = "Больному прописано лекарство, которое нужно пить по %.1f г %d раза в день в течение %d дня. " +
            "В одной упаковке %d таблеток лекарства по %.1f г. Какого наименьшего количества упаковок хватит на весь курс лечения?";


    private int min1 = 1;
    private int max1 = 9;
    private int dif1 = max1 - min1;
    private double weight = (random.nextInt(dif1) + min1) / 10.0;

    private int min2 = 1;
    private int max2 = 6;
    private int dif2 = max2 - min2;
    private int count_1 = random.nextInt(dif2) + min2;

    private int min3 = 7;
    private int max3 = 60;
    private int dif3 = max3 - min3;
    private int days = random.nextInt(dif3) + min3;

    private int min4 = 6;
    private int max4 = 10;
    private int dif4 = max4 - min4;
    private int count_2 = random.nextInt(dif4) + min4;

    private int result = (int) Math.ceil(count_1 * days / count_2);


    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, weight, count_1, days, count_2, weight);
    }
}