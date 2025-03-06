package academy.devdojomaratonajavaIntroducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        // Condicao Simples (If)
        if (true){
            System.out.println("Ola!");
        }

        // Condicao Composta (If - Else)
        if(true){
            System.out.println("Ola!");
        }else{
            System.out.println("Alo!");
        }

        // Condicao Encadeada: Sao condicoes compostas uma dentro da outra
        /* Exemplo:
         * Resolva Usando estrutura de condicao encadeada
         *   Idade < 15: Categoria Infantil
         *  Idade >= 15 && Idade < 18: Categoria Juvenil
         *  Idade < 18: Categoria Adulpto
         */
        int idade = 19;
        String categoria;
        if(idade < 15){
            categoria = "Categoria Infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);

    }
}
