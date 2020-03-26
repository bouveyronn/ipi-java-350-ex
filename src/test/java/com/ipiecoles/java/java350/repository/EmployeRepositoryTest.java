package com.ipiecoles.java.java350.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeRepositoryTest {

    @Autowired
    EmployeRepository employeRepository;

    @Test
    void findLastMatricule() {

        //Given

        //When
        String lastMatricule = employeRepository.findLastMatricule();

        //Then

    }
}