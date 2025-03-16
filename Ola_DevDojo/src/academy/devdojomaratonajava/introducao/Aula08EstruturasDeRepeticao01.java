package academy.devdojomaratonajava.introducao;

public class Aula08EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        /*Estruturas de Repeticao: Sao trechos do programa, onde
        * uma certa instrucao sera repetida ate que uma certa condicao
        * logica seja falsa.
        * Tipos de Estruturas de Repeticao:
        *  - While: Pos-testada;
        *  - do while: Pre-testada;
        *  - for: tem var de controle
        * */

        /*EXEMPLO: Elabore um programa que conta de 1 ate 5*/
        // Usando a estrutura WHILE:
        int n = 0;
        while(n<=5){
            System.out.println("USANDO WHILE: " + n);
            n++; //Incremento da var
        }

        // Usando a estrutura DO-WHILE:
        int n1 = 0;
        do{
            System.out.println("USANDO DO-WHILE: "+ n1);
            n1++;
        }while(n1<=5);

        // Usando a estrutura FOR:
        for(int i = 0; i <= 5; i++){
            System.out.println("USANDO FOR: " + i);
        }
        //BREAK: Comando que sai da estrutura de repeticao (For-loop)
        /*
        * for (int i = 0; i<10; i++){
        *   System.out.printl(i);
        *   if(i < 5){
        *       break; Vai sair da estrutura de repeticao
        *   }
        * }*/
        //CONTINUE: Comando que ignora todos codigos abaixo dele e repete o for-loop.
        /*for (int i = 0; i<10; i++){
         *   System.out.printl(i);
         *      if(i <5){
         *          continue;
         *      }
         * }*/
    }
}
