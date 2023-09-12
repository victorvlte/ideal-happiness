package ex01.exemplo01;

import java.util.Scanner;

public class Repeticao {

    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            int contador, limite;

            System.out.println("Informe o limite da contagem");
            limite = entrada.nextInt();

            
            contador= 1; //inicialização

            while (contador <= limite) { // condição
            System.out.println(contador);
            contador = contador + 1; // passos 

            entrada.close();


        }
        
    }
    
}
