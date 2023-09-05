package ex01;

import java.util.Scanner;

/**
 * Ex01 Ler duas notas e emitir a média aritmética.
 */
public class Ex01 {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float numero1, numero2, media;

    System.out.println("Digite um número:");
    numero1 = entrada.nextFloat();
    System.out.println("Digite o segundo número");
    numero2 = entrada.nextFloat();
    media= (numero1 + numero2)/2;
    System.out.println("A média aritmética é:"+(media));


    if (media >= 7)
        System.out.println("Parabéns você foi aprovado!");  
    else
        System.out.println("Você não atingiu a pontuação necessária, tente novamente!");  

        System.out.println("Final do Programa");
}
}