package Exnovo;

import java.util.Scanner;

public class novo {

    public static void main(String[] args) {
        

        Scanner entrada = new Scanner(System.in);


      // Criação de um vetor chamado notas com (10) posições.

      double notas[] = new double[10];
      double medias, soma=0;
        final int QUANTIDADE_NOTAS=10; // seria uma constante, não pode mudar de valor

    
      for (int i = 0; i < notas.length; i++) {

        System.out.println("Digite a " + (i+1) + "° nota" );
        
        notas [i] = entrada.nextDouble();
        soma=soma + notas[i];
       
      }

      medias= soma/QUANTIDADE_NOTAS;
      System.out.println("A média da turma é " + medias);
        
      //Notas maiores que a média!
      System.out.println("Notas maiores que a média");
      for (int i = 0; i < notas.length; i++) {
        if (notas[i]> medias) {
        System.out.print(notas[i] + " ");    
        }
        

        
  
        }
        
        //Como percorrer o vetor ao contrário

        // for (int i = 9; i>=0 ; i--) {

        // System.out.print(notas[i] + " ");
        
      
    

        
    }
    
}
