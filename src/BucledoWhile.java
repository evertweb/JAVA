import java.util.Scanner; // Importa la clase Scanner que se utilizará para leer la entrada del usuario

public class BucledoWhile {
    public static void main(String[] args) {
        int respuesta = 3; // Inicializa la variable respuesta con el valor 3

        // Ciclo do-while
        // Se ejecutará al menos una vez antes de evaluar la condición
        do {
            System.out.println("selleciona la opcion desada"); // Imprime un mensaje en la consola
            System.out.println("1. Ajustes de la app"); // Imprime la opción 1
            System.out.println("2. Ajustes de la cuenta"); // Imprime la opción 2
            System.out.println("3. salir"); // Imprime la opción 3

            Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
            respuesta = Integer.valueOf(sc.nextLine()); // Lee la entrada del usuario como una cadena y la convierte a un entero

            // Estructura switch para evaluar la respuesta del usuario
            switch (respuesta) {
                case 1:
                    System.out.println("bien has entrado a los ajustes de la app"); // Imprime un mensaje si se selecciona la opción 1
                    break; // Sale del switch
                case 2:
                    System.out.println("a continuación podras modificar los ajustes de la cuenta "); // Imprime un mensaje si se selecciona la opción 2
                    break; // Sale del switch
                case 3:
                    System.out.println("cerrando la app"); // Imprime un mensaje si se selecciona la opción 3
                    break; // Sale del switch
                default:
                    System.out.println("seleccione una opcion valida"); // Imprime un mensaje si se selecciona una opción inválida
            }
        } while (respuesta != 3); // Continúa el ciclo mientras la respuesta sea diferente de 3

        System.out.println("se termino el programa"); // Imprime un mensaje cuando se sale del ciclo
    }
}
