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
            questions1.setQuestion("How many computer languages are in use ?");
            questions1.setAnswers(new String[]{"2000","5000","50","20"});
            questions1.setIndexOfRightAnswer(0);
            questions.add(questions1);

            QuizQuestions questions2 = new QuizQuestions();
            questions2.setId(++idCounter);
            questions2.setQuestion(" What does the Internet prefix WWW stand for ?");
            questions2.setAnswers(new String[]{"Wide Width Wickets","World Wide Web","World Wide Weather","Western Washington World"});
            questions2.setIndexOfRightAnswer(1);
            questions.add(questions2);

            QuizQuestions questions3 = new QuizQuestions();
            questions3.setId(++idCounter);
            questions3.setQuestion("When was the DVD introduced ?");
            questions3.setAnswers(new String[]{"1970","1990","2000","1995"});
            questions3.setIndexOfRightAnswer(3);
            questions.add(questions3);

            QuizQuestions questions4 = new QuizQuestions();
            questions4.setId(++idCounter);
            questions4.setQuestion("Which of these is a file format for digital images ?");
            questions4.setAnswers(new String[]{"CIA","JPG","ICBM","IBM"});
            questions4.setIndexOfRightAnswer(1);
            questions.add(questions4);
        }
        return questions;
    }
}
