package ru.novikov_dm.studystraus;

public class Problem1_2_3 extends Problem {
    private String requirement = "На одну порцию рисовой каши требуется %d грамм риса и %.2f литра молока. " +
            "Какое наибольшее количество порций каши может приготовить столовая, " +
            "если в ее распоряжении есть %d грамм риса и %d литра молока?";

    private int min1 = 1;
    private int max1 = 9;
    private int dif1 = max1 - min1;
    private int rice_1 = (random.nextInt(dif1) + min1) * 10;

    private int min2 = 10;
    private int max2 = 20;
    private int dif2 = max2 - min2;
    private double milk_1 = (random.nextInt(dif2) + min2) / 100.0;

    private int min3 = 10;
    private int max3 = 99;
    private int dif3 = max3 - min3;
    private int rice_2 = (random.nextInt(dif3) + min3)*10;

    private int min4 = 1;
    private int max4 = 5;
    private int dif4 = max4 - min4;
    private int milk_2 = random.nextInt(dif4) + min4;

    private int rice = (int)Math.floor(rice_2 / rice_1);
    private int milk = (int)Math.floor(milk_2 / milk_1);


    @Override
    public String getResult(){
        if (rice > milk) {
            return String.valueOf(milk);
        }
        return String.valueOf(rice);
    }

    @Override
    public String getRequirement() {
        return String.format(requirement, rice_1, milk_1, rice_2, milk_2);
    }
}
