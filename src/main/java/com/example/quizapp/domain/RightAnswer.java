package com.example.quizapp.domain;

import java.util.List;

public class RightAnswer {

    private List<Integer>indexOfRightAnswer;


    public void setIndexOfRightAnswer(int answerId) {

        indexOfRightAnswer.add(answerId);
    }

    public void setIndexOfRightAnswer(List<Integer> indexOfRightAnswer) {
        this.indexOfRightAnswer = indexOfRightAnswer;
    }

    public List<Integer> getIndexOfRightAnswers() {
        return indexOfRightAnswer;
    }
}
