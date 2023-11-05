import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("ingrese el priemer numero: ");
        int numero1 = scanner.nextByte();

        System.out.println("ingrese el segundo numero: ");
        int numero2 = scanner.nextByte();

        int suma= (numero1+numero2);
        System.out.println( " la suma de los numeros es : "+ suma);

    }
}
