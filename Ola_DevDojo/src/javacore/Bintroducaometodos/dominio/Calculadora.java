package javacore.Bintroducaometodos.dominio;

public class Calculadora {
    /*Metodos: Sao os comportamentos de uma classe, coisas que uma classe esta capacitada a fazer.
    */

    public void somaNumeros(){
        short n1 = 5;
        short n2 = 7;
        System.out.println(" Soma " + n1 +" + " + n2 );
        System.out.println(n1 + n2);
    }

    public void subtraiNumeros(){
        short n1 = 5;
        short n2 = 7;
        System.out.println( " Subtrai "+ n2 + " - "+ n1);
        System.out.println(n2 - n1 );

    }

    /*
        Parametros: Variaveis que sao usadas em um metodo
        Argumentos: Valores que estarao dentro dos parametros
        int num = 7;
        num => Parametro
        7 => Argumento
     */

    public void multiplicarNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
}
