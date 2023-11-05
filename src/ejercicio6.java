import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("ingrese la medida del radio del cilimdro");
        double radio= scanner.nextByte();


        System.out.print("ingrese la medida de la altura del cilindro");
        double altura= scanner.nextByte();


        double area = 2*3.1416*radio*(radio+altura);
        double volumen = 3.1416*radio*radio*altura;

        System.out.println("el area total del cilindro es: "+area);
        System.out.println("el volumen total del cilindro es :"+volumen);
    }
}
