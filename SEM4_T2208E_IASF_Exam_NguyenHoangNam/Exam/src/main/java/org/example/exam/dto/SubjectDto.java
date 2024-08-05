package org.example.exam.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class SubjectDto {

    private Long subjectID;

    private String name;
    private Integer credit;


}
