package ru.novikov_dm.studystraus;

public class Problem1_3_3 extends Problem {
    private String requirement1 = "Каждый день во время конференции расходуется %d пакетиков чая. Конференция длится %d дня. " +
            "Чай продаётся в пачках по %d пакетиков. Сколько пачек чая нужно купить на все дни конференции?";
    private String requirement2 = "За неделю в офисе расходуется %d листов. Какое наименьшее количество пачек " +
            "бумаги нужно купить в офис на %d недели, если в пачке %d листов бумаги формата А4?";

    private String[] requirements = {requirement1, requirement2};


    private int min1 = 1;
    private int max1 = 5;
    private int dif1 = max1 - min1;
    private int count_1 = (random.nextInt(dif1) + min1) * 100;

    private int min2 = 2;
    private int max2 = 7;
    private int dif2 = max2 - min2;
    private int days = random.nextInt(dif2) + min2;

    private int min3 = 3;
    private int max3 = 15;
    private int dif3 = max3 - min3;
    private int count_2 = (random.nextInt(dif3) + min3) * 100;

    private int result = (int) Math.ceil(count_2 * days / count_1);


    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    private int n = random.nextInt(requirements.length);

    @Override
    public String getRequirement() {
        return String.format(requirements[n], count_2, days, count_1);
    }
}