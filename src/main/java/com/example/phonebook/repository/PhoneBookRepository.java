package com.example.phonebook.repository;

import com.example.phonebook.model.PhoneBook;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneBookRepository extends JpaRepository<PhoneBook, Long> {

    List<PhoneBook> findPhoneBookByFirstName(String firstName);
}
