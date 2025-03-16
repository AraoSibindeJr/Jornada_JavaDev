package javacore.introducaoclasses.test.Estudante;

import javacore.introducaoclasses.dominio.Estudante;

public class test01 {
    public static void main(String[] args) {
        // Declaracao de objecto:
        /*
        * Estrutura:
        * [Nome da Classe] [nome do objecto/ var de ref] = new [nome da classe] ();*/
        Estudante estudante01 = new Estudante(); //Objecto inicializado
        estudante01.nome = "Arao";
        estudante01.sexo = 'M';
        estudante01.idade = 19;

        // Saida de dados
        System.out.println("Nome do estudante: "+ estudante01.nome);
        System.out.println("Sexo de estudante "+ estudante01.sexo);
        System.out.println("Idade do estudante: "+estudante01.idade + "anitos");
    }
}
