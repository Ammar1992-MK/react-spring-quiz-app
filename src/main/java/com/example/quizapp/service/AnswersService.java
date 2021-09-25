package com.example.quizapp.service;

import com.example.quizapp.domain.Result;
import com.example.quizapp.repository.RightAnswersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswersService {

    @Autowired
    private RightAnswersRepository rightAnswersRepo;

    public Result updateResult (int[] body){

        //stream array list of quizzes
        //answerId == indexOfRight Answer correct ++ else wrong++
        int correctCounter = 0;
        int wrongCounter = 0;

        List<Integer> rightAnswer = rightAnswersRepo.fetchRightAnswersId();
        Result result = new Result();

        for(int i = 0; i < rightAnswer.size(); i++){
            if(rightAnswer.get(i) == body[i]){
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
