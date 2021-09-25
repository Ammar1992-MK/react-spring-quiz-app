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

            QuizQuestions questions5 = new QuizQuestions();
            questions5.setId(++idCounter);
            questions5.setQuestion("What is part of a database that holds only one type of information?");
            questions5.setAnswers(new String[]{"Report","File","Record","Field"});
            questions5.setIndexOfRightAnswer(3);
            questions.add(questions5);

            QuizQuestions questions6 = new QuizQuestions();
            questions6.setId(++idCounter);
            questions6.setQuestion("'OS' computer abbreviation usually means ?");
            questions6.setAnswers(new String[]{"Order of Significance","Open Software","Operating System","Optical Sensor"});
            questions6.setIndexOfRightAnswer(2);
            questions.add(questions6);

            QuizQuestions questions7 = new QuizQuestions();
            questions7.setId(++idCounter);
            questions7.setQuestion("How many bits is a byte? ?");
            questions7.setAnswers(new String[]{"8","4","32","16"});
            questions7.setIndexOfRightAnswer(0);
            questions.add(questions7);
        }
        return questions;
    }
}
