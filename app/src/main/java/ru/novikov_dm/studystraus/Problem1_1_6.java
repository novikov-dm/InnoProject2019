package ru.novikov_dm.studystraus;

public class Problem1_1_6 extends Problem {
    private String requirement = "Выпускники 11а покупают букеты цветов для последнего звонка: " +
            "из %d роз каждому учителю и из %d роз классному руководителю и директору. " +
            "Они собираются подарить букеты %d учителям (включая директора и классного руководителя), " +
            "розы покупаются по оптовой цене %d рублей за штуку. Сколько рублей стоят все розы?";

    private int min1 = 10;
    private int max1 = 15;
    private int dif1 = max1 - min1;
    private int teachers = random.nextInt(dif1) + min1;

    private int min2 = 1;
    private int max2 = 5;
    private int dif2 = max2 - min2;
    private int count_1 = (random.nextInt(dif2) + min2) * 2 + 1;

    private int min3 = 6;
    private int max3 = 12;
    private int dif3 = max3 - min3;
    private int count_2 = (random.nextInt(dif3) + min3) * 2 + 1;

    private int min4 = 35;
    private int max4 = 75;
    private int dif4 = max4 - min4;
    private int price = 5 * (int)Math.ceil((random.nextInt(dif4) + min4)/5.0);

    private double result = ((teachers - 2) * count_1 + 2 * count_2) * price;

    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, count_1, count_2, teachers, price);
    }

}
