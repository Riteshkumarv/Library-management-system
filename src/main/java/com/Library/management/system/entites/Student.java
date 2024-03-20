package com.Library.management.system.entites;

import com.Library.management.system.enums.Department;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;

    @Enumerated(EnumType.STRING)
    private Department department;

    @OneToOne(mappedBy = "student" , cascade = CascadeType.ALL)
    @JsonManagedReference
    private Card card;

}
