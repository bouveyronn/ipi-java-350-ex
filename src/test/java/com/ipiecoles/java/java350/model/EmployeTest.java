package com.ipiecoles.java.java350.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class EmployeTest {

    @Test
    public void testNbAnneeAncienneteNow(){
        //Given
        Employe employe = new Employe();
        employe.setDateEmbauche(LocalDate.now());

        //When
        Integer nbAnnees = employe.getNombreAnneeAnciennete();

        //Then
        Assertions.assertEquals(0,nbAnnees);
    }

    @Test
    public void TestMethodeNominale(){
        //Given
        String date = "2015-08-16";

        //default, ISO__LOCAL__DATE
        LocalDate localDate = LocalDate.parse(date);
        Employe employe = new Employe("BERNARD", "Mathis", "M666MB", localDate, 2500.0, 1, 1.0);
        //When
        //Then
        Assertions.assertEquals(5, employe.getNombreAnneeAnciennete());
    }

    @Test
    public void TestMethodeSieclePrev(){
        //Given
        String date = "1990-08-16";

        //default, ISO__LOCAL__DATE
        LocalDate localDate = LocalDate.parse(date);
        Employe employe = new Employe("BERNARD", "Mathis", "M666MB", localDate, 2500.0, 1, 1.0);
        //When
        //Then
        Assertions.assertEquals(30, employe.getNombreAnneeAnciennete());
    }

    @Test
    public void TestMethodeDateIsNull(){
        //Given
        String date = "1990-08-16";

        //default, ISO__LOCAL__DATE
        LocalDate localDate = LocalDate.parse(date);
        Employe employe = new Employe("BERNARD", "Mathis", "M666MB", null, 2500.0, 1, 1.0);
        //When
        //Then
        Assertions.assertEquals(0, employe.getNombreAnneeAnciennete());
    }

    @Test
    public void testNbAnneeAncienneteNowPlus3(){
        //Given
        Employe employe = new Employe();
        employe.setDateEmbauche(LocalDate.now().plusYears(3));

        //When
        Integer nbAnnees = employe.getNombreAnneeAnciennete();

        //Then
        Assertions.assertEquals(0,nbAnnees);
    }


}
