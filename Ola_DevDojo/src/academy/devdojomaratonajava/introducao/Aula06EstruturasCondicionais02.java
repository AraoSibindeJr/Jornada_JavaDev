package academy.devdojomaratonajava.introducao;

public class Aula06EstruturasCondicionais02 {
    public static void main(String[] args) {
      /* Operador Ternario: E uma forma mais reduzida e simples de fazer condicoes, que
       por vezes pode substituir a "If - Else".
       */
        // Estrutura: [var] = (condicao) ? {parte True} : {parte False};
        int num = 10;
        int num2 = 10;
        String resp = (num + num2 == 20)? "SIM":"NAO";
        System.out.println(resp);
        /*Switch case: E uma estrutura de condicao geralmente usada quando temos que verificar muitas
        * condicoes em forma de "Menu".*/
        /*ESTRUTURA DO SWITCH CASE
        * Switch(var){
        *   case 1:
        *       [Bloco de codigo]
        *   break;
        *   case 2:
        *       [Bloco de codigo]
        *   break;
        *   default:
        *       [Bloco de codigo]
        *   breal;
        * }*/
    }
}
