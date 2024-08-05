package org.example.exam.dto;


import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentScoreDto {

    private Integer studentScoreId;
    private Integer studentId;
    private Integer subjectId;
    private Double score1;
    private Double score2;
    private String grade;


}
