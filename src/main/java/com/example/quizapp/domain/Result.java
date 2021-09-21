package com.example.quizapp.domain;

public class Result {

    private int answerId;
    private int questionId;
    private int countWrong;
    private int countCorrect;

    public Result(int countWrong, int countCorrect) {
        this.countWrong = countWrong;
        this.countCorrect = countCorrect;
    }

    public void setCountWrong(int countWrong) {
        this.countWrong = countWrong;
    }

    public void setCountCorrect(int countCorrect) {
        this.countCorrect = countCorrect;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getCountWrong() {
        return countWrong;
    }

    public int getCountCorrect() {
        return countCorrect;
    }

    public int getAnswerId() {
        return answerId;
    }

    public int getQuestionId() {
        return questionId;
    }
}
