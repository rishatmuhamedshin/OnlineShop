package com.muhamedshin.diplom.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Entity
@Table(name = "person")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String login;
    @Column
    private Integer password;
    @Column
    private String email;
    @Column
    private String fio;
    @Column
    private LocalDate date_bt;
    @Column
    private String gender;
    @Transient
    private Integer age;

    public Person(String login, Integer password, String email, String fio, String gender) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.fio = fio;
        this.gender = gender;
    }

    public Person() {

    }
    public Integer getAge(){
        return Period.between(this.date_bt, LocalDate.now()).getYears();
    }
}
