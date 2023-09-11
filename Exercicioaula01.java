package ex01;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Exercicioaula01 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Double n1, n2, media, exame;
        int faltas;
        
        //entradade de dados 
        
        System.out.println("Digite a primeira nota:");
        n1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota:");
        n2 = entrada.nextDouble();
        System.out.println("Digite o numero de faltas");
        faltas = entrada.nextInt();

        //processamento 
    
        if (faltas>=16) {
        System.out.println("Você foi Reprovado!");    
        
        }else{
            media =(n1 + n2)/2;
            if(media>=6) {
                System.out.println("Você foi aprovado!");
            
            }else{
                System.out.println("Informe a nota do exame");
                exame= entrada.nextDouble();
                media= (media + exame) / 2;
                
                if (media>=5) {
                    System.out.println("Aluno aprovado no exame!");
                
                }else{
                    System.out.println("Aluno reprovado...");
                    
                }

            }
            
        }
        
        
                  
        




    }
    
}
