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

            QuizQuestions questions2 = new QuizQuestions();
            questions2.setId(++idCounter);
            questions2.setQuestion("When was the first launch of facebook");
            questions2.setAnswers(new String[]{"1999","2000","2003","2010"});
            questions2.setIndexOfRightAnswer(2);
            questions.add(questions2);

            QuizQuestions questions3 = new QuizQuestions();
            questions3.setId(++idCounter);
            questions3.setQuestion("When was the first launch of facebook");
            questions3.setAnswers(new String[]{"1999","2000","2003","2010"});
            questions3.setIndexOfRightAnswer(2);
            questions.add(questions3);

            QuizQuestions questions4 = new QuizQuestions();
            questions4.setId(++idCounter);
            questions4.setQuestion("When was the first launch of facebook");
            questions4.setAnswers(new String[]{"1999","2000","2003","2010"});
            questions4.setIndexOfRightAnswer(2);
            questions.add(questions4);
        }
        return questions;
    }
}
