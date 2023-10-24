package exercicios;

public class App {

    public static void main(String[] args) {

        
        Estudante e1 = new Estudante(111, "Carlos","ADS");
        Pessoa p = new Pessoa(123, "Kleber");    
        
        //System.out.println("Registro "+ p.getRegistro());
        //System.out.println("Pessoa "+ p.getNome());
        //e1.setNomeCurso("ADS");
        //e1.setNome("Carlos");
        System.out.println("Registro: " + e1.getRegistro());
        System.out.println("Estudante: " + e1.getNome());
        System.out.println("Curso: " + e1.getNomeCurso());

           System.out.println("....");

           System.out.println(p.toString());
           
           System.out.println(e1); 


        Pessoa e2 = new Estudante(222, "Ricardo", "ADM");  
        System.out.println(e2);

    }

    
}
