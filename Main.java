import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar cateto (Ancho): ");
        double aSide = scanner.nextDouble();

        System.out.print("Ingresar cateto (Altura): ");
        double xSide = scanner.nextDouble();
        scanner.close();

        double length = PythagorasLength.findLength(aSide, xSide);

        System.out.println("La longitud de la escalera es: " + String.format("%.3f", length));
    }
}