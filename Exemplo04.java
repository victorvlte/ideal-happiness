package Exemplo04;

import java.util.Scanner;

public class Exemplo04 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double total;
        int opcao,suco=0,refri=0,hamburguer=0,hotdog=0;
        char valor;

        System.out.println("---Anhembi---");
        System.out.println("Cardápio: ");
        System.out.println("1-Suco    R$ 2,00");
        System.out.println("2-Refri   R$ 7,00");
        System.out.println("3-Hotdog  R$ 12,50");
        System.out.println("4-Hambúrguer  R$ 19,20");
        System.out.println("--------------------");
        
        do{
            System.out.println("Digite seu pedido: ");
            opcao = entrada.nextInt();
            switch(opcao) {
            
                case 1:
                System.out.println("Você escolheu o suco");
                suco = suco + 1;
                break;
                case 2:
                System.out.println("Você escolheu o Refri");
                refri = refri + 1;
                break;
                case 3:
                System.out.println("Você escolheu o HotDog");
                hotdog = hotdog + 1;
                break;
                case 4:
                System.out.println("Você escolheu o Hambúrguer");
                hamburguer = hamburguer + 1;
                break;
                default:
                System.out.println("Você escolheu uma opção melhor");

            }
            System.out.println("Deseja incluir outro item (s ou n)");
            valor = entrada.next(). charAt(0);
        } while (valor != 'n');

        if(suco>0){
            System.out.println("Quantidade de suco: "+suco);
        }
        if(refri>0){
            System.out.println("Quantidade de refris: "+refri);
        }
        if(hotdog>0){
            System.out.println("Quantidade de hotdogs: "+ hotdog);
        }
        if(hamburguer>0){
            System.out.println("Quantidade de hamburguer: "+hamburguer);
        }
        total = suco*2.00+refri*7.00+hotdog*12.50+hamburguer*19.20;

        System.out.println("valor total: "+ total);
        System.out.printf("O total do pedido: R$ %.2f \n\n",total);

        entrada.close();
    }
    
}
