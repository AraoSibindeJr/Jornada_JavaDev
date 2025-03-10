package academy.devdojomaratonajavaIntroducao;

public class Aula10ArraysUnidimensionais01 {
    public static void main(String[] args) {
        // Arrays: Espacos na memoria que podem armazenar multiplos dados do mesmo tipo primitivo
        int[] num = new int[7]; //Declaracao de array com 7 indices (CONTAGEM INICIA NO 0)
        num [0] = 10; //Atribuicao do dado (10) no indice [0]
        //num [7] = 1; //Vai dar erro porque o indice vai ate [6] (CONTAGEM INICIA NO 0)
        System.out.println(num[0]);//Print do valor do vector que esta no indice 0
    }
}
