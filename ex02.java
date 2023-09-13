/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaterca02;

import java.util.Scanner;

/**
 *
 * @author profslvo
 */
public class ex02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int id1, somaIdade=0;
        
        for (int i = 1; i <=5; i++) {
            System.out.println("Digite a idade");
            id1 = entrada.nextInt();
            somaIdade = somaIdade + id1;
            
        }
            System.out.println("A soma das idades e:"+somaIdade);
        
        
        
            
        }
        
        
       
      
        
    }

