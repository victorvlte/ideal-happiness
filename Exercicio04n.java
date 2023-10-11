/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionariogerente;

/**
 *
 * @author profslvo
 */
public class Exercicio04n {
    
    public static void main(String[] args) {
        funcionario f = new funcionario();
        f.cargo = "Vendedor";
        f.nome = "Claudio";
        f.salario = 1200;
        
        Gerente g = new Gerente();
        g.nome = "Cresio";
        
        System.out.println(f.toString());
        g.atualizar(f, "Estoquista");
        System.out.println(f.toString());
        g.atualizar(f, 850);
        ;
        
        
    }
}
