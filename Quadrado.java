package Contas;

public class Quadrado extends FiguraGeometrica{

    //atributos

    private double lado;

    @Override
    public double calcularArea(){

        return this.lado*this.lado;
        
    }


    
}
