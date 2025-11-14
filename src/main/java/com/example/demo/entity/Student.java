package com.example.demo.entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;
}
