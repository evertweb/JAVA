import java.util.Scanner;

public class Pratica {
    public static void main(String[] args) {
        int numero1=10;
        int numero2=23;
        int numero3=12;
        System.out.println("escribe un numero");
        Scanner scanerdeevert=new Scanner(System.in);
        int numerodeentrda= scanerdeevert.nextInt();


        for (int i=1; i<10; i++){
            System.out.println(numerodeentrda);
        }
        System.out.println(suma(2,4));







    }
    public static int suma(int a, int b){
        return a+b;
    }

}
