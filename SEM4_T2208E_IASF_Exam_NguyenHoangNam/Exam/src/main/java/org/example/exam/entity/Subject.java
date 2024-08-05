package org.example.exam.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "subject_t")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectID;

    @Column(name = "name")
    private String name;

    @Column(name = "credit")
    private Integer credit;

}
