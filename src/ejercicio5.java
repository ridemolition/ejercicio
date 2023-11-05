import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("ingrese el numero del lado de un cuadrado:");
        double ladodelcuadrado = scanner.nextByte();
        double area= ladodelcuadrado*ladodelcuadrado;
        double perimetro= ladodelcuadrado*4;

        System.out.println("el area del cuadrado : "+area);
        System.out.println("el perimetro  del cuadrado es:"+perimetro);


    }
}
