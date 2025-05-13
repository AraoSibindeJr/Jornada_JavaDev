package javacore.Bintroducaometodos.Aula02.test;

import javacore.Bintroducaometodos.Aula02.test.dominio.Calculadora;

public class TestCalculadora3 {
    public static void main(String[] args) {
        Calculadora calc3 = new Calculadora();
        calc3.divNumeros(0,0);
        System.out.println(calc3.divNumeros(20,2));
    }
}
