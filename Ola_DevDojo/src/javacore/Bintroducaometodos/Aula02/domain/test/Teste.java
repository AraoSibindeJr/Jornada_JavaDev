package javacore.Bintroducaometodos.Aula02.domain.test;

import javacore.Bintroducaometodos.Aula02.domain.Funcionario;

public class Teste {
    public static void main(String[] args) {
        Funcionario F1 = new Funcionario("Arao", 19, 12000);
        System.out.println(F1.toString());
    }
}
