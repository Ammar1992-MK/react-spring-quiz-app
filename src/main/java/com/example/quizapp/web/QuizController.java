package com.example.quizapp.web;

import com.example.quizapp.domain.QuizQuestions;
import com.example.quizapp.domain.Result;
import com.example.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/api/answers")
    public ResponseEntity<?> updateResult(@RequestBody int[] body){
        //call the service
       Result updatedResult =  quizService.updateResult(body);

       return ResponseEntity.ok(updatedResult);
    }
}
