package com.example.firstproject;

public class Tester {

    private final String TRUE = "Правильно";
    private final String FALSE = "Неправильно";

    private String question;
    private String answer;
    private String rightAnswer;

    public Tester(String answer, String rightAnswer) {
        this.answer = answer;
        this.rightAnswer = rightAnswer;
    }

    public String test(){
        if (answer.equals(rightAnswer)){
            return TRUE;
        }
        return FALSE;
    }



    public String getTRUE() {
        return TRUE;
    }

    public String getFALSE() {
        return FALSE;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
}