package com.example.quizapp.domain;

public class QuizQuestions {

    private int id;
    private String question;
    private String[] answers;
    private int answerId;
    private int indexOfRightAnswer;
    private int countWrong;
    private int countCorrect;
    private int chosenAnswerId;
    private int questionId;


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

    public int getAnswerId() {
        return answerId;
    }

    public int getCountWrong() {
        return countWrong;
    }

    public int getCountCorrect() {
        return countCorrect;
    }

    public int getChosenAnswerId() {
        return chosenAnswerId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public void setCountWrong(int countWrong) {
        this.countWrong = countWrong;
    }

    public void setCountCorrect(int countCorrect) {
        this.countCorrect = countCorrect;
    }

    public void setChosenAnswerId(int chosenAnswerId) {
        this.chosenAnswerId = chosenAnswerId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }
}
