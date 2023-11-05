import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("ingrese la base del triangulo :");
        double base = scanner.nextDouble();

        System.out.println("ingresa la altura del triangulo : ");
        double altura = scanner.nextDouble();

        double  area = (base  * altura)/2;
        System.out.println("el area  del triangulo es : "+ area);
    }
}
