package com.Library.management.system.entites;

import com.Library.management.system.enums.CardStatus;
import com.Library.management.system.enums.Genre;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CreationTimestamp
    private Date issueDate;
    @Enumerated(EnumType.STRING)
    private CardStatus cardStatus;
    private String validTil;

    @OneToOne
    @JsonBackReference
    @JoinColumn
    Student student;
}
