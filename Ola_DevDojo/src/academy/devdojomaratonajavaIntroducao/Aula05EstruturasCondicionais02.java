package academy.devdojomaratonajavaIntroducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
      /* Operador Ternario: E uma forma mais reduzida e simples de fazer condicoes, que
       por vezes pode substituir a "If - Else".
       */
        // Estrutura: [var] = (condicao) ? {parte True} : {parte False};
        int num = 10;
        int num2 = 10;
        String resp = (num + num2 == 20)? "SIM":"NAO";
        System.out.println(resp);


    }
}
