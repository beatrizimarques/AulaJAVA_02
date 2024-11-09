
package aulabasico;
import java.util.Scanner;

public class PrimeiraAula {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //entrada de dados pelo teclado

        System.out.println("Entre com o primeiro número:");
        int numero = entrada.nextInt();

        System.out.println("Entre com o segundo número:");
        int numero2 = entrada.nextInt();

        int soma = numero + numero2;

        System.out.println("O valor do primeiro número é: " + numero);
        System.out.println("O valor do segundo número é: " + numero2);
        System.out.println("A soma dos dois números é: " + soma);

    }

}
