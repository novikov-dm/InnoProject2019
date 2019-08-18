package com.example.firstproject;

abstract class Problem {
    private String requirement;

    private String userAnswer;
    private double result;

    public abstract String getRequirement();

    public void setUserAnswer(String answer) {
        this.userAnswer = answer;
    }

    public boolean getVerdict() {
        try {
            double eps = 0.001;
            return Math.abs(Double.parseDouble(userAnswer) - result) < eps;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //TO DO
    //Создать метод возвращающий образец решения
}
