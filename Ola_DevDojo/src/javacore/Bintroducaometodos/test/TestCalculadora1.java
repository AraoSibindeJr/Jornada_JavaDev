package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class TestCalculadora1 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaNumeros();
        System.out.println(" ========= ");
        calc.subtraiNumeros();
    }
}
