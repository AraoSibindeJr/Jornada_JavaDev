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
    /*  Metodos com Return: Sao metodos que devolvem determinado dado, geralmente sao usados para devolver o rtesultado
        de certa codificacao executada no metodo
    */
    public double divNumeros(int n1, int n2){
        if(n1 == 0 || n2 == 0){
            return 0;
        }
        double resultado = n1/n2;
        return resultado;
    }
    //Nota que temos dois 'returns' no metodo, mas, apenas um returno sera executado.
    //Um metodo do tipo return so retorna uma unica vez por execucao
}
