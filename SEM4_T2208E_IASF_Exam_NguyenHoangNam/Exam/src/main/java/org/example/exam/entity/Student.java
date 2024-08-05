package org.example.exam.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "student_t")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentID;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

}
