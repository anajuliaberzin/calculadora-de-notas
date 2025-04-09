import java.util.Scanner;
public class NotasFacens{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);             
                
        //Receber notas
        System.out.println("Inserir nota da AC1");
        double ac1 = scn.nextDouble();  
        System.out.println("Sua nota na AC1 foi de  " + ac1);

        System.out.println("Inserir nota da AC2");
        double ac2 = scn.nextDouble();
        System.out.println("Sua nota na AC2 foi de  " + ac2);

        System.out.println("Inserir nota da AG");
        double ag = scn.nextDouble();
        System.out.println("Sua nota na AG foi de  " + ag);
        
        System.out.println("Inserir nota da AF");
        double af = scn.nextDouble();   
        System.out.println("Sua nota na AF foi de  " + af);

        // Receber nota mínima
        System.out.println("Inserir a nota mínima para aprovação");
        double minima = scn.nextDouble();
        System.out.println("A nota mínima para aprovação eh" + minima);

        //Cálculo da média final
        double resultado = (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);

        //Exibir o resultado
        System.out.println("Sua média eh   " + resultado   +  "e a nota mínima para aprovaçao eh  " + minima);  
        System.out.println("Se sua nota for maior que " +  minima  +   "Parabéns, você foi aprovado!!!");
        
    }
}