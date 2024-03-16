public class EjemploWhile {
    public static void main(String[] args) {
        int contador = 1; // Inicializamos el contador en 1
        int limite = 10; // Establecemos el límite en 10

        // Utilizamos un bucle while que se ejcuta mientras
        // la variable contador sea menor o igual al limite para imprimir los números del 1 al 10
        while (contador <= limite) {
            System.out.println(contador);
            contador++; // Incrementamos el contador en 1
        }

        System.out.println("Fin del bucle");
    }
}