package org.example.exam.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private Long studentID;

    private String name;
    private String address;

}

