import java.util.Scanner;

public class MediaUm {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

 //TODO: Complete os espaços em branco com uma possível solução para o desafio 
        media = (A * 3.5 +  B * 7.5)/11; 

        System.out.printf("MEDIA = %.5f",  media );
        System.out.println();
        sc.close();
        
    }
}
