/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pernas;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Pernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite a qnt. de pernas da especie:");
        
        int pernas = entrada.nextInt();
        System.out.println("Isso é um(a)");
        
        switch (pernas) {
            
            case 1: System.out.println("Saci"); break;
            case 2: System.out.println("´Bípede"); break;
            case 4: System.out.println("Quadrúpee"); break;
            case 6,8: System.out.println("Aranha");break;
            default: 
            System.out.println("ET");
            }
            System.out.println("tipo");
                    
                
        }
        
        
    }
    
}
