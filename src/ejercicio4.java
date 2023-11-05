import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("ingrese los euros a cambiar:");
        double euro = scanner.nextDouble();
        double TasaDeCambio = 1.06;
        double dolares = euro * TasaDeCambio;
        System.out.println(euro + " "+"cambio a dolares equivale a :"+" "+dolares );

    }
}
