package org.example.exam.service;


import com.example.sis.dto.StudentScoreDTO;
import com.example.sis.entity.StudentScore;
import com.example.sis.repository.StudentScoreRepository;
import org.example.exam.dto.StudentScoreDto;
import org.example.exam.entity.Score;
import org.example.exam.repository.StudentScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentScoreService {

    @Autowired
    private StudentScoreRepository studentScoreRepository;

    public StudentScoreDto saveStudentScore(StudentScoreDto studentScoreDTO) {
        Score studentScore = new Score();
        // Set properties
        studentScore = studentScoreRepository.save(studentScore);
        studentScoreDTO.setStudentScoreId(studentScore.getScore1());
        return studentScoreDTO;
    }

    public String calculateGrade(Double score1, Double score2) {
        double gradePoint = 0.3 * score1 + 0.7 * score2;
        if (gradePoint >= 8.0) return "A";
        if (gradePoint >= 6.0) return "B";
        if (gradePoint >= 4.0) return "D";
        return "F";
    }
}

