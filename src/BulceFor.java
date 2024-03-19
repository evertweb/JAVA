import java.util.Scanner;

public class BulceFor {
    public static void main(String[] args) {
        //el metodo main solo acepta metodos static

        int response;
        //variable de iniciacion; expresion booleana, actualizacion
        int n1;
        Scanner scevert = new Scanner(System.in);
         response=Integer.valueOf(scevert.nextLine());


        for ( response=1; response <= 10; response++){
            hola();


        }
    }
    public static void hola(){
        System.out.println("hola mi perro");

    }
}
