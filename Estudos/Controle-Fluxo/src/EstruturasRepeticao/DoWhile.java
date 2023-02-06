package EstruturasRepeticao;
import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            //Executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

        }
        while(tocando());

        System.out.println("Alô !!!");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1; //Se o valor aleatório de 1 a 3 for == 1, significa que atendeu..
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando   
        return ! atendeu;
    }
}
