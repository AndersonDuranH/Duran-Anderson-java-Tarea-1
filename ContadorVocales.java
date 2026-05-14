import java.util.Scanner;
public class ContadorVocales{
    
    public void ContadorVocales(Scanner sc){
        System.out.print("Digite una frase: ");
        String frase = sc.nextLine();

        int contador = 0;

        frase = frase.toLowerCase();

        for(int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador++;
            }
        }
        System.out.println("La cantidad de vocales en la frase es: " + contador);
        sc.close();

    }
}