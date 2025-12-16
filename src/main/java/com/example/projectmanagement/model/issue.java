package com.example.projectmanagement.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class issue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private User assignee;

}
