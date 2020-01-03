package com.phongthuchanh.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "classes")
@Getter
@Setter
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 256)
    @Column(name = "name", length = 256)
    private String name;

    @Column(name = "subject_name")
    private String subjectName;


    @Column(name = "total_student")
    private Integer totalStudent;

    @Column(name = "total_credit")
    private Integer totalCredit;

    @Column(name = "total_practising")
    private Integer totalPractising;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private User teacher;

    @Column(name = "teacher_id")
    private Long teacherId;


    @Column(name = "status")
    private Integer status;


}
