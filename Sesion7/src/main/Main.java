package main;

import models.Persona;

import java.time.LocalDate;
import java.time.Period;

import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        Persona rolando = new Persona("Rolando", "Mayorga"
        , LocalDate.of(2008,3,28), true);
        System.out.println(rolando);
        int edad = Period.between(rolando.getFechaNacimiento(),hoy).getYears();
        System.out.println("Rolando tiene " + edad + " años");
    }
}
