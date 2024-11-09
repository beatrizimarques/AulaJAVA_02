package aulabasico;
import java.util.Scanner;

public class Atividade01 {

    // entrar com quatro notas pelo teclado e fazer média

    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        float nota1 = notas.nextFloat();

        System.out.println("Entre com a segunda nota:");
        float nota2 = notas.nextFloat();

        System.out.println("Entre com a terceira nota:");
        float nota3 = notas.nextFloat();

        System.out.println("Entre com a quarta nota:");
        float nota4 = notas.nextFloat();

        float media = ((nota1 + nota2 + nota3 + nota4) /4);

        System.out.println("A média das notas é: " + media);

    }


}
