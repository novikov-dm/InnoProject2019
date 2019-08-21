package ru.novikov_dm.studystraus;

import java.util.Random;

abstract class Problem {

    Random random = new Random();

    private String requirement;

    private String userAnswer;
    private double result;

    public abstract String getRequirement();

    public void setUserAnswer(String answer) {
        this.userAnswer = answer.trim();
    }
    public abstract String getResult();

    public boolean getVerdict() {
        try {
            double eps = 0.001;
            return Math.abs(Double.parseDouble(userAnswer) - Double.parseDouble(getResult())) < eps;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    //TO DO
    //Создать метод возвращающий образец решения

}
