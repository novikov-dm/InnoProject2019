package ru.novikov_dm.studystraus;

public class Problem1_4_3 extends Problem {
    private String requirement1 = "В городе N живет %d жителей. Среди них %d%% детей и подростков. " +
            "Среди взрослых жителей %d%% не работает (пенсионеры, студенты, домохозяйки и т. п.). " +
            "Сколько взрослых жителей работает?";
    private String requirement2 = "Среди %d жителей города %d%% не интересуются футболом. Среди жителей, " +
            "интересующихся футболом, %d%% смотрели по телевизору финал Лиги чемпионов. " +
            "Сколько жителей города не смотрели этот матч по телевизору?";

    private String[] requirements = {requirement1, requirement2};


    private int min1 = 2;
    private int max1 = 1000;
    private int dif1 = max1 - min1;
    private int people = (random.nextInt(dif1) + min1) * 10000;

    private int min2 = 15;
    private int max2 = 30;
    private int dif2 = max2 - min2;
    private int percent_1 = random.nextInt(dif2) + min2;

    private int min3 = 40;
    private int max3 = 60;
    private int dif3 = max3 - min3;
    private int percent_2 = random.nextInt(dif3) + min3;

    private int result = people * (100 - percent_1) * (100 - percent_2) / 10000;


    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    private int n = random.nextInt(requirements.length);

    @Override
    public String getRequirement() {
        return String.format(requirements[n], people, percent_1, percent_2);
    }
}