package ru.novikov_dm.studystraus;

public class Problem1_3_4 extends Problem {
    private String requirement = "Диагональ экрана телевизора равна %d дюймам. Выразите диагональ экрана в сантиметрах, " +
            "если в одном дюйме 2,54 см. Результат округлите до целого числа сантиметров.";


    private int min1 = 19;
    private int max1 = 105;
    private int dif1 = max1 - min1;
    private int count = random.nextInt(dif1) + min1;

    private int result = (int) Math.round(count * 2.54);

    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, count);
    }
}