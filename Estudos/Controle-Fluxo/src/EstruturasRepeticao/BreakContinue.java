package EstruturasRepeticao;

public class BreakContinue {
    public static void main(String[] args) {
        
        for (int numero = 0; numero <= 5; numero++){
            if(numero == 3){
                //break;
                continue;// Pula o numero 3
            }
            System.out.println(numero);
        }
    }
    
}
