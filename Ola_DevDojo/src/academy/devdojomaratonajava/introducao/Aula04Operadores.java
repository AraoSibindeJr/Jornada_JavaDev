package academy.devdojomaratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores Matematicos Basicos (Soma;Subtracao;Divisao;Multiplicacao)
        int n1 = 10;
        int n2 = 10;
        System.out.println(n1+n2);
        System.out.println(n1-n2);
        System.out.println(n1/n2);
        System.out.println(n1*n2);
        // Operadores Relacionais ( < ; > ; <= ; >= ; == ; != )
        boolean op1 = 10 > 11; //false
        boolean op2 = 10 < 11; //true
        boolean op3 = 10 <= 11.9; //true
        boolean op4 = 10 >= 112; //false
        boolean op5 = 10 == 10; //true
        boolean op6 = 10 != 0;//true
        // Operadores Logicos ( AND (&&) ; OR (||) ; NOT(!)
        int op7 = 200;
        boolean testeLogico = (n1 + n1 > op7 && n2 - n1 == op7); // false
        boolean testeLogico2 = (n1 + n1 < op7 || n2 - n1 == op7); // true
        // Operadores de atribuicao && Operadores Unarios
        int num = 10;
        int num2 = 0;
        num = num + 10; // Incremento normal
        num += 10; // Usando Operador de atribuicao
        num2++; // Usando operador unario

        ++num; //Pre - Incremento
        num++; //Pos - Incremento


    }
}
