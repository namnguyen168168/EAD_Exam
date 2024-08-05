package org.example.exam.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "student_score_t")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentID;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectID;

    @Column(name = "score1")
    private Double score1;

    @Column(name = "score2")
    private Double score2;


}