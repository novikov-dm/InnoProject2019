package ru.novikov_dm.studystraus;

public class Problem1_4_1 extends Problem {
    private String requirement = "Железнодорожный билет для взрослого стоит %d рублей. " +
            "Стоимость билета для школьника составляет 50%% от стоимости билета для взрослого. " +
            "Группа состоит из %d школьников и %d взрослых. Сколько рублей стоят билеты на всю группу?";


    private int min1 = 30;
    private int max1 = 70;
    private int dif1 = max1 - min1;
    private int price = (random.nextInt(dif1) + min1) * 100;

    private int min2 = 10;
    private int max2 = 30;
    private int dif2 = max2 - min2;
    private int children = random.nextInt(dif2) + min2;

    private int min3 = 2;
    private int max3 = 4;
    private int dif3 = max3 - min3;
    private int people = random.nextInt(dif3) + min3;


    private int result = (price / 2 * children + price* people);


    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, price, children, people);
    }
}