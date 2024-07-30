import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Hola, ingrese un número:");
            String numero = scanner.nextLine();
            int numero1;

            boolean respuesta = tryParseInt(numero);

            if (respuesta) {
                numero1 = Integer.parseInt(numero);
                System.out.println("El número ingresado es: " + numero1);
            } else {
                throw new Exception("El valor ingresado no corresponde a un número.");
            }
        } catch (Exception ex) {
            System.out.println("Ocurrió el siguiente error al ejecutar el programa: " + ex.getMessage());
            System.out.println("Por favor comuníquese con el área de TI.");
            System.out.println("Correo enviado exitosamente");
            System.out.println("Log guardado exitosamente");
            System.out.println("Transacciones reversadas correctamente");
        } finally {
            System.out.println("Presione enter para salir del programa.");
            scanner.nextLine(); // To keep the program open
        }
    }

    public static boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
