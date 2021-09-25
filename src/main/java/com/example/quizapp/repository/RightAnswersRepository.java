package com.example.quizapp.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RightAnswersRepository {

    List<Integer> rightAnswer = new ArrayList<>();


    public List<Integer> fetchRightAnswersId(){

       if(rightAnswer.size() == 0){

           rightAnswer.add(0);
           rightAnswer.add(1);
           rightAnswer.add(3);
           rightAnswer.add(1);
           rightAnswer.add(3);
           rightAnswer.add(2);
           rightAnswer.add(0);
       }

        return rightAnswer;

    }
}
