package com.example.springthymeleafdemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "people")
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;
    
    @Column(length = 50, nullable = false)
    private String name;
    
    @Column(length = 200, nullable = true)
    private String mail;
    
    @Column(nullable = true)
    private Integer age;
    
    @Column(nullable = true)
    private String memo;
}
