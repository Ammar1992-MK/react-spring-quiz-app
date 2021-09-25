package com.example.quizapp.domain;

public class QuizQuestions {

    private int id;
    private String question;
    private String[] answers;

    public QuizQuestions() {
    }

    public QuizQuestions(int id, String question, String[] answers) {
        this.id = id;
        this.question = question;
        this.answers = answers;
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


    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

}
