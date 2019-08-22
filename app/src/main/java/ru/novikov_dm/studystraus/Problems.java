package ru.novikov_dm.studystraus;

import java.io.Serializable;

public class Problems implements Serializable {

    private int nProblems = 5;
    private Problem[] problems = new Problem[nProblems];

    public Problems(Problem problem1, Problem problem2, Problem problem3, Problem problem4,Problem problem5){
        this.problems[0] = problem1;
        this.problems[1] = problem2;
        this.problems[2] = problem3;
        this.problems[3] = problem4;
        this.problems[4] = problem5;
    }

    public void getProblems(Problem[] problems){
        this.problems = problems;
    }

    public Problem[] setProblems(){
        return problems;
    }



}
