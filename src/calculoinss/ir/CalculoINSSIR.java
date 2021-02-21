package calculoinss.ir;

import java.util.Scanner;

public class CalculoINSSIR {

    public static void main(String[] args) {
        //Variaveis
        Scanner Teclado = new Scanner(System.in);
        float salreal;
        float saliq = 0;
        float inss = 0;
        float ir = 0;
        float destt;
        float desdep;
        float quantdep;
        float dep = (float) 189.50;

        //Entrada de Dados
        System.out.println("Calcule o seu Salario Liquido após descontos do INSS e Imposto de Renda");
        System.out.println("Insira o seu Salário Mensal");
        salreal = Teclado.nextFloat();
        System.out.println("Insira a quantidade de dependentes, caso não tenha digite 0");
        quantdep = Teclado.nextFloat();

        // Processamento de Dados
        // Calculo de INSS
        if ((salreal > 998) && (salreal <= 1556)) {

            inss = salreal * 8 / 100;

        }

        if ((salreal > 1556) && (salreal <= 2594)) {

            inss = salreal * 9 / 100;

        }
        if ((salreal > 2594) && (salreal <= 51189)) {

            inss = salreal * 11 / 100;
            // Calculo Imposto de Renda
        }
        if ((salreal <= 1930)) {

            ir = salreal * 0 / 100;
        }
        if ((salreal > 1030) && (salreal <= 2826)) {

            ir = (float) (salreal * 7.5 / 100);
        }
        if ((salreal > 2826) && (salreal <= 3751)) {

            ir = salreal * 15 / 100;
        }
        if ((salreal > 3751) && (salreal <= 4664)) {

            ir = (float) (salreal * 22.5 / 100);
        }
        if ((salreal > 4664)) {

            ir = (float) (salreal * 27.5 / 100);
        }
        // Calculo do Desconto
        desdep = quantdep * dep;
        destt = (inss + ir + desdep);
        saliq = salreal - destt;

        // Saida de dados
        System.out.println("========Salario Líquido========");
        System.out.println("O Seu Salario Líquido é igual:$" + saliq);
        System.out.println("É descontado de INSS:$" + inss);
        System.out.println("É descontado de Imposto de Renda:$" + ir);
        System.out.println("É descontado de Dependentes:$" +desdep);
        System.out.println("É descontado ao todo do seu Salario Mensal:$" + destt);

    }

}
