package Contas;

public class ContaCorrente {

    //atributos
    private double saldo;
    //metodos acessores e modificadores
    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double.valor){
        
    }
    public void depositar(double valor){
        this.saldo = this.saldo + valor;


    }    
    
    public void sacar(double valor){
        if (this.saldo>=(valor*1.005){
        this.saldo=this.saldo -(valor*1.005);
        }else System.out.println("Saldo insuficiente!");     
    }



}
