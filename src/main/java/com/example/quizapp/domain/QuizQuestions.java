package com.example.quizapp.domain;

public class QuizQuestions {

    private int id;
    private String question;
    private String[] answers;
    private int indexOfRightAnswer;

    public QuizQuestions() {
    }

    public QuizQuestions(int id, String question, String[] answers, int indexOfRightAnswer) {
        this.id = id;
        this.question = question;
        this.answers = answers;
        this.indexOfRightAnswer = indexOfRightAnswer;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public int getIndexOfRightAnswer() {
        return indexOfRightAnswer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public void setIndexOfRightAnswer(int indexOfRightAnswer) {
        this.indexOfRightAnswer = indexOfRightAnswer;
    }
}
