/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionariogerente;

/**
 *
 * @author profslvo
 */
public class Gerente {

    //atributos
    String nome;
    
    //Comportamentos
    public void atualizar(funcionario aux, String cargo){
        aux.cargo=cargo;
   }
    
    public void atualizar(funcionario aux,double salario){
        aux.salario=salario;
    }
    
}
