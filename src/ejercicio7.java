import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("ingrese el valor del radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        double longitutd= 2*3.1416*radio;
        double area= 3.1416*radio*radio;

        System.out.println("el valor de la longitud de la circunferencia es: "+longitutd);
        System.out.println("el calor del area del circulo es "+area);

    }
}
