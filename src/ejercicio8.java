import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
//todo proceso
        System.out.print("ingrese el primer numero:");
        double numero1 = scanner.nextByte();
        System.out.print("ingrese el segundo numero:");
        double numero2 = scanner.nextByte();
        System.out.print("ingrese el tercer numero:");
        double numero3 = scanner.nextByte();

        //TODO solucion

        double promedio =(numero1+numero2+numero3)/3;
        System.out.println("el promedio de los numeros es"+promedio);
        

    }
}
