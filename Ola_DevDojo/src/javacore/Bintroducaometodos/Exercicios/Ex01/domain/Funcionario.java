package javacore.Bintroducaometodos.Exercicios.Ex01.domain;

public class Funcionario {
    /*EXERCICIO: Criar uma classe Funcionario, com 3 atributos: nome; idade; salarios
    * Metodos:
    * => Metodo Imprimir
    * => Metodo para calcular media dos salarios*/


    // Instanciar os atributos
    private String nome;
    private int idade;
    private double salario;

    // Criar construtor
    public Funcionario(String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    // Metodo imprimir
    public String toString(){
        return "Nome: " + nome + " Idade: " + idade + " Salario: " + salario;
    }

}
