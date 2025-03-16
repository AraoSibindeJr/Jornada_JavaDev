package academy.devdojomaratonajavaIntroducao;

public class Aula11ArraysMultidimensionais01 {
    // Arays Multidimensionais: Sao arrays com mais de dois indices.
    // Exemplo de array Bidimensional:
    public static void main(String[] args) {
        int [][] num = new int[3][3];
        for (int i =0; i<num.length; i++){
            for(int j =0; j<num[i].length; j++){
                System.out.print(" Helloo");
            }
            System.out.println();
        }
        //Nota: O nr de indices do array, e igual ao numero de "for-loops" encadeados.
        // Array Tridimensional
        int [][][] num2 = new int[3][3][3];
        for(int i = 0; i < num2.length; i++){
            for(int j =0; j <num2[i].length; j++){
                for(int k=0; k<num2[j].length;k++){
                    System.out.print(" Helloo");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
