package academy.devdojomaratonajava.introducao;

public class Aula07EstruturasCondicionaisExercicios {
    public static void main(String[] args) {
        /*EXERCICIO 01: Cria um codigo que, tendo em conta um numero [1 ate 7], mostra
        * o dia da semana. Considere Domingo = 1
        * */
        int n = 4;
        switch (n){
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("SEGUNDA");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("QUARTA");
                break;
            case 5:
                System.out.println("QUINTA");
                break;
            case 6:
                System.out.println("SEXTA");
                break;
            case 7:
                System.out.println("SABADO");
                break;
            default:
                System.out.println("ERROR");
                break;
        }

        /*EXERCICIO 02: Imprima o sexo, Masculino ou Feminino, tendo em conta "M" = Masculino e
        * "F" = Feminino. NOTA: USANDO OPERADOR TERNARIO
        * */
        char m = 'M';
        if(m == 'M'){
            System.out.println(" Sexo = Masculino");
        }else if( m == 'F'){
            System.out.println(" Sexo = Feminino");
        }else {
            System.out.println("NOTA: Apenas {M/F}");
        }

    }
}
