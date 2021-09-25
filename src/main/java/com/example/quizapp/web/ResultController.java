package com.example.quizapp.web;


import com.example.quizapp.domain.Result;
import com.example.quizapp.service.AnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ResultController {

    @Autowired
    private AnswersService answersService;

    @PutMapping("/api/answers")
    public ResponseEntity<?> updateResult(@RequestBody int[] body){
        //call the service
        Result updatedResult =  answersService.updateResult(body);

        return ResponseEntity.ok(updatedResult);
    }
}
