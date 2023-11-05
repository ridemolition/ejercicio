import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("ingrese el numero aqui: ");
        Double numero = scanner.nextDouble();

        double resultado =(numero * numero);
        System.out.print("el numero elevado al cuadrado de "+numero+" "+"es = "+resultado);

    }
}
