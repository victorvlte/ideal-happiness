package Contas;

public class App {


    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente();
        ClienteEspecial ce = new ClienteEspecial();

        cc.depositar(100);
        System.out.println(cc.getSaldo());
        cc.sacar(10);
        System.out.println(cc.getSaldo());


        



        








    }
    
}
