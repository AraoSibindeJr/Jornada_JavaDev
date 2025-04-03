package javacore.Bintroducaometodos.Exercicios.Ex01.domain;

public class Funcionario {
    /*EXERCICIO: Criar uma classe Funcionario, com 3 atributos: nome; idade; salarios
    * Metodos:
    * => Metodo Imprimir
    * => Metodo para calcular media dos salarios*/

    // Criacao dos Atributos
    private String nome;
    private int idade;
    private double [] salario;

    // Criacao de setters e getters:
    public String setNome(){
        return nome;
    }
    public int setIdade(){
        return idade;
    }
    public void getNome(String nome){
        this.nome = nome;
    }
    public void getIdade(int idade){
        this.idade = idade;
    }

    // Criacao dos metodos da questao
    public void imprimir(){}
    public void mediaSalarios(double[] salario){
        double v = 2500;
        for (int i = 0; i < salario.length; i++){
            salario[i] = v + 50;
            v -= 100;
        }
        double media;
    }


}
