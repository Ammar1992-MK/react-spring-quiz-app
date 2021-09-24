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


    public List<QuizQuestions> fetchAllQuestions (){
       return quizRepo.fetchQuiz();
    }

    public Result updateResult (int[] body){

        //stream array list of quizzes
        //answerId == indexOfRight Answer correct ++ else wrong++

         int correctCounter = 0;
         int wrongCounter = 0;

        List<QuizQuestions> quizList = quizRepo.fetchQuiz();
        Result result = new Result();
        for(int i = 0; i < quizList.size(); i++){

            if(quizList.get(i).getIndexOfRightAnswer() == body[i]){
                 correctCounter++;

            } else {

                wrongCounter++;
            }
        }

        result.setCorrectAnswers(correctCounter);
        result.setWrongAnswers(wrongCounter);

        return result;

    }

}

