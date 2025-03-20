package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Professor;

public class TesteProfessor {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Sibinde";
        prof.idade = 45;
        prof.cadeira = "Programacao II";
        prof.sal = 75000;
        System.out.println(" Dados do Professor ");
        System.out.println("Nome: " + prof.nome + " Idade: "+ prof.idade + "Cadeira: " + prof.cadeira + "Salario: " + prof.sal);
    }
}
