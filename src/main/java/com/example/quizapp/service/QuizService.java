package com.example.quizapp.service;

import com.example.quizapp.domain.QuizQuestions;
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
}

