package treinoa1;
import java.util.Random;

public class ex01 {

        /**
         * @param args
         */
        public static void main(String[] args) {
            Random aleatorios = new Random();
            
            int vetInt [] = new int [15];
            
            int maior=0,menor=0;
            
            for (int i = 0; i < 15; i++) {
                vetInt[i] = aleatorios.nextInt(10);
                if(i==0){
                    maior= vetInt[i];
                    menor= vetInt[i];
                }

                

            }   

            for (int i = 0; i < 15; i++) {
                if(vetInt[i]> maior){
                    maior= vetInt[i];

                }
                if(vetInt[i]<menor){
                    menor = vetInt[i];
                }
            }
                for (int i = 0; i < 15; i++) {
                    System.out.printf("%d \t",vetInt[i]);
                    
                }

            
                System.out.printf("\n");
            System.out.println("O maior valor e:  "+maior);
            System.out.println("O menor valor e:  " +menor);

        
        }
    
}
