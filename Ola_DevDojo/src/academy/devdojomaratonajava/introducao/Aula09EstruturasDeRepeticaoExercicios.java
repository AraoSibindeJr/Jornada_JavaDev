package academy.devdojomaratonajava.introducao;

public class Aula09EstruturasDeRepeticaoExercicios {
    public static void main(String[] args) {
        /*
        * EXERCICIO 01: Imprimir todos numeros pares de 1 ate 100
        * EXERCICIO 02: Imprimir apenas os primeiro 25 numeros existentes no intervalo de 1 ate 100 (Usar Break
        * */

        // EXERCICIO 01
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){//Condicao de paridade de um numero
                System.out.println(i);
            }
        }
        //EXERCICIO 02
        for (int i = 0; i <= 100; i++) {
            if(i > 25){
                break;//Vai sair da estrutura de repeticao, quando a condicao for verdadeira
            }
            System.out.println(i);
        }
    }
}
