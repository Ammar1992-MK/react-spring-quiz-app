package com.example.quizapp.web;

import com.example.quizapp.domain.QuizQuestions;
import com.example.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class QuizController {

    @Autowired
    private QuizService quizService;


    @GetMapping("/api/quiz")
    public ResponseEntity<?> fetchQuiz(){

            List<QuizQuestions> quizQuestions =  quizService.fetchAllQuestions();

            return ResponseEntity.ok(quizQuestions);
    }
}
