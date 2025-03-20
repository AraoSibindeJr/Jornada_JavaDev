package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class TestEstudante01 {
    public static void main(String[] args) {
        // Declaracao de objecto:
        /*
        * Estrutura:
        * [Nome da Classe] [nome do objecto/ var de ref] = new [nome da classe] ();*/
        Estudante estudante01 = new Estudante(); //Objecto inicializado
        Estudante estudante02 = new Estudante(); //Object Inicializado
        estudante01.nome = "Arao";
        estudante01.sexo = 'M';
        estudante01.idade = 19;

        estudante02.nome = "Junior";
        estudante02.sexo = 'M';
        estudante02.idade = 18;
        // Saida de dados
        System.out.println("Nome do estudante: "+ estudante01.nome);
        System.out.println("Sexo de estudante "+ estudante01.sexo);
        System.out.println("Idade do estudante: "+estudante01.idade + " anitos");
        System.out.println(" ============================================= ");
        System.out.println("Nome do estudante: "+ estudante02.nome);
        System.out.println("Sexo de estudante "+ estudante02.sexo);
        System.out.println("Idade do estudante: "+estudante02.idade + " anitos");
    }
}
