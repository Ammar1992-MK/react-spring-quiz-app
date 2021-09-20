package com.example.quizapp.repository;

import com.example.quizapp.domain.QuizQuestions;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuizRepository {

    private List<QuizQuestions> questions = new ArrayList<>();
    private int idCounter = 0;

    public List<QuizQuestions> fetchQuiz(){

        if(questions.size() == 0){
            QuizQuestions questions1 = new QuizQuestions();
            questions1.setId(++idCounter);
            questions1.setQuestion("When was the first launch of facebook");
            questions1.setAnswers(new String[]{"1999","2000","2003","2010"});
            questions1.setIndexOfRightAnswer(2);

            questions.add(questions1);
        }
        return questions;
    }
}
