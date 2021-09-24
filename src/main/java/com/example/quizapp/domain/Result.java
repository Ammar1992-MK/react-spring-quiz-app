package com.example.quizapp.domain;

import java.util.ArrayList;
import java.util.List;

public class Result {

    private List<Result> chosenAnswers = new ArrayList<>();
    private int correctAnswers;
    private int wrongAnswers;


    public List<Result> getChosenAnswers() {
        return chosenAnswers;
    }

    public void setChosenAnswers(List<Result> chosenAnswers) {
        this.chosenAnswers = chosenAnswers;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public int getWrongAnswers() {
        return wrongAnswers;
    }

    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public void setWrongAnswers(int wrongAnswers) {
        this.wrongAnswers = wrongAnswers;
    }
}
