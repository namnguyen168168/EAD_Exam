package org.example.exam.controller;

import org.example.exam.dto.StudentScoreDto;
import org.example.exam.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student-scores")
public class StudentScoreController {

    @Autowired
    private StudentScoreService studentScoreService;

    @PostMapping
    public StudentScoreDto addStudentScore(@RequestBody StudentScoreDto studentScoreDTO) {
        return studentScoreService.saveStudentScore(studentScoreDTO);
    }

    @GetMapping("/grade")
    public String getGrade(@RequestParam Double score1, @RequestParam Double score2) {
        return studentScoreService.calculateGrade(score1, score2);
    }
}

