package academy.devdojomaratonajava.introducao;

public class Aula10ArraysUnidimensionais01 {
    public static void main(String[] args) {
        // Arrays: Espacos na memoria que podem armazenar multiplos dados do mesmo tipo primitivo
        int[] num = new int[7]; //Declaracao de array com 7 indices (CONTAGEM INICIA NO 0)
        num [0] = 10; //Atribuicao do dado (10) no indice [0]
        //num [7] = 1; //Vai dar erro porque o indice vai ate [6] (CONTAGEM INICIA NO 0)
        System.out.println(num[0]);//Print do valor do vector que esta no indice 0

        // Iteracao sobre array: A estrutura de repeticao (for) e a mais usada para iterar arrays.
        int[] n = new int[]{1,2,3,4,5};//Declaracao e atribuicao de valores para cada indice
        for(int i = 0; i<n.length; i++){
            System.out.println(n[i]);//Sera imprimido o valor correspondente ao indice 'i'
        }
        // array.length => Retorna o tamanho do array.
        String[] nomes = new String[]{"Messi","C.Ronaldo","Neymar"};
        for(String i : nomes){
            System.out.println(i);
        }
        // Foreach: Estrutura de repeticao muito usada para percorrer um array.
    }
}
