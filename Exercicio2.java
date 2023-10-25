package Contas;

public class Exercicio2 {

    public abstract class FiguraGeometrica{

        //atributos

        private String nome;

        //metodos acessor
        public String getNome(){
            return this.nome;

        }
        //comportamentos
        
        public abstract double calcularArea();
    
    }
    
}
