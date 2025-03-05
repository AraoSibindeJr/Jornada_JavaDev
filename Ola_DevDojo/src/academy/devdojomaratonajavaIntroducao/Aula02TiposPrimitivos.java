package academy.devdojomaratonajavaIntroducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        /*Tipos Primitivos: Existem oito (8) tipos primitivos em java:
         - int; char; double; long; boolean; float; short; bite.
         - Variavel: e um espaco criado para armazenar determinados tipos de dados na memoria
         da maquina.
        */
        int num; // Criacao de uma variavel
        num = 10; // Declaracao de uma variavel
        boolean op = false; // Criacao e declaracao de variavel em uma so linha de codigo (recomendado)
        System.out.println(num); // Saida de dados
        System.out.println(" A resposata e: " + op ); // (+) Simbolo de concatenacao
        // CASTING: Forca um valor a entrar numa variavel que em termos normais, nao suporta o valor.
        // ESTRUTURA DO CASTING: [tipo] [nome] = (tipo casting) [valor] [inicial do tipo]
        int n = (int) 100000000000000L; // Exemplo de casting
        // STRING: A string nao e um tipo primitivo, e um tipo de referencia, isto e, e uma classe.
        // A sua sintaxe inicia com a primeira letra maiuscula.
        String nome = "Arao Jr"; //Exemplo de string.
    }
}
