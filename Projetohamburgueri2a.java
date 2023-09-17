   package projetohamburgueria;
    import java.util.Scanner;
    public class Projetohamburgueria {

       public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
            int opcao, i=0;
            char valor;
            int[] carrinho = new int[10];
            
            System.out.println("----Anhembi Lanches ----");
            System.out.println("Cardapio");
            System.out.println("1 Suco        R$ 2,00 ");
            System.out.println("2 - Refri     R$ 7,00");
            System.out.println("3 - HotdoG    R$ 12,50");
            System.out.println("4 - Hamburguer R$ 19,20");
            
            do {
                System.out.println("Digite seu pedido");
                
                opcao = entrada.nextInt();
                
                switch (opcao) { 
                    
                    case 1:
                        System.out.println("Voce escolheu suco");
                        break;
                    case 2:
                        System.out.println("Voce escolheu refri");
                        break;
                    case 3:
                        System.out.println("Voce escolher Hot Dog");
                        break;
                    case 4:
                        System.out.println("Você escolheu hamburguer");
                        break;
                    default:
                        System.out.println("Voce escolheu uma opcao invalida!");
                        
                           
                }
                    carrinho[i] = opcao;
                    System.out.println("Deseja incluir outro item? (s ou n) ");
                    
                    valor = entrada.next().charAt (0);
                    i++;
            }       while (valor != 'n');
                    
                    
                    //for(int j=0; j<10;j++) {
                    for( i=0; i<10;i++) {
                        
                    switch (carrinho [i]){
                        
                        case 1:
                        System.out.println("Você escolheu suco");
                        break;
                        
                        case 2:
                        System.out.println("Você escolheu Refri");
                        break;
                        
                        case 3:
                        System.out.println("Voce escolher Hot Dog");
                        break;
                        
                        case 4:
                        System.out.println("Você escolheu hamburguer");
                        break;
                        
                        //default:
                           
                    }
                          
                        
                    
                        
                        
                        
                    }
                           
    }
       
}
