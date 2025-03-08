package academy.devdojomaratonajavaIntroducao;

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

        /*EXEMPLO: Elabore um programa que conta de 1 ate 10*/
        // Usando a estrutura WHILE:
        int n = 0;
        while(n<5){
            System.out.println(n);
            n++; //Incremento da var
        }

        // Usando a estrutura DO-WHILE:
        int n1 = 0;
        do{
            System.out.println(n);
            n++;
        }while(n<5);

        // Usando a estrutura FOR:
        for(int i = 0; i < 5; i++){
            System.out.println(n);
        }
    }
}
