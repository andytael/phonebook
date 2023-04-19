package com.example.phonebook.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "phonebook")
@Data
public class PhoneBook {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long phonebookId;

    @Column(length = 40)
    private String firstName;

    @Column(length = 40)
    private String lastName;

    @Column(length = 12)
    private String phoneNumber;
}
