package academy.devdojomaratonajava.introducao;
/*     EXERCICIO
*   Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem.
* Eu, <nome>, morando no endereco <endereco>, confirmo que recebi o salario de <salario>, na
* data <data>.
*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        // Criacao e declaracao das variaveis
        String nome = " Arao Sibinde";
        int endereco = 202;
        double salario = 750000;
        String dataRecebimentoSalario = "15/07/2038";
        // Duas formas de saida de informacao:
        // 1 - Colocar toda mensagem numa var do tipo "string"
        // 2 - Usar o "sout" directamente.
        String mensagemFinal = "Eu,"+nome+ ", morando no endereco "+endereco+ ", confirmo que recebi o salario de "+salario+"$ na data "+dataRecebimentoSalario;
        System.out.println(mensagemFinal); // Usando a forma "1"

    }
}
