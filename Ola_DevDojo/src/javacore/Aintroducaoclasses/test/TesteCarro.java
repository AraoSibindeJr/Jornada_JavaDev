package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();


        carro1.nome = "BMW";
        carro1.modelo = "M3 G80";
        carro1.anoLancamento = 2020;

        carro2.nome = "Ferrari";
        carro2.modelo = "296 GTB";
        carro2.anoLancamento = 2021;

        System.out.println(" \n Carro 01: ");
        System.out.println("==> " +carro1.nome);
        System.out.println("==> " +carro1.modelo);
        System.out.println("==> " +carro1.anoLancamento);


        System.out.println(" \n Carro 02: ");
        System.out.println("==> " +carro2.nome);
        System.out.println("==> " +carro2.modelo);
        System.out.println("==> " +carro2.anoLancamento);
    }
}
