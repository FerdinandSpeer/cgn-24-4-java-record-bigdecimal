package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        StudentRecord currywurst = new StudentRecord("1a2", "Thomas", "Bauer", 25);
        //Getter bei Recods heißen wir die Property also ohne get

        currywurst.age();
        //da keine Setter bei Record verfügbar, muss man Änderungen wie folgt einpflegen:
        currywurst = new StudentRecord(currywurst.id(), "Ricardo", currywurst.lastName(), currywurst.age());
        currywurst = currywurst.withFirstname("Jan");

        System.out.println(currywurst);

        double a = 0.1;
        double b = 0.2;
            System.out.println(a+b);

        BigDecimal number1 = new BigDecimal("123.653635");
        BigDecimal number2 = new BigDecimal("1233.23453461");

        BigDecimal sum = number1.add(number2);
        BigDecimal sub = number1.subtract(number2);
        BigDecimal mult = number1.multiply(number2);
        BigDecimal div = number1.divide(number2, RoundingMode.HALF_UP);

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div.setScale(9,RoundingMode.UP));
    }
}