package ex01;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salario, prestacao, calculo;

        // Entrada
        System.out.println("Digite o valor do salario R$");
        salario = entrada.nextFloat();
        System.out.println("Digite o valor da prestação R$");
        prestacao = entrada.nextFloat();

        // processamento
        calculo = (salario * 0.3f);
        // saída

        if (prestacao <= calculo)
            System.out.println("Emprestimo aprovado!");
        else
            System.out.println("emprestimo recusado");

        entrada.close();

    }

}
