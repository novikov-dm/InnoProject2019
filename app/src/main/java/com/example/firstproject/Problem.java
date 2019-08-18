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
        return userAnswer.equals(String.valueOf(result));
    }

    //TO DO
    //Создать метод возвращающий образец решения
}
