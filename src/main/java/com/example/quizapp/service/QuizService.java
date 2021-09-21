package com.example.quizapp.service;

import com.example.quizapp.domain.QuizQuestions;
import com.example.quizapp.domain.Result;
import com.example.quizapp.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    // front-end            java-server
    // HttpRequest ---> Controller ---> Service --- > Repository
    // front-end  <--- Controller < --- Service <---

    @Autowired
    private QuizRepository quizRepo;
    private Result result = new Result(0,0);
    private int correctCounter = 0;
    private int wrongCounter = 0;

    public List<QuizQuestions> fetchAllQuestions (){
       return quizRepo.fetchQuiz();
    }

    public Result updateResult (Result result){

        //stream array list of quizzes
        //if questionId = question Id && answer7Id == indexOfRight Answer correct ++ else wrong++

        List<QuizQuestions> quizList = quizRepo.fetchQuiz();


        for(int i = 0; i < quizList.size(); i++){
            if(quizList.get(i).getId() == result.getQuestionId() && quizList.get(i).getIndexOfRightAnswer() == result.getQuestionId()){
                correctCounter++;
                result.setCountCorrect(correctCounter);
            } else {
                wrongCounter++;
                result.setCountWrong(wrongCounter);
            }

        }

        return result;

    }
}

