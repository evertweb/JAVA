public class Funciones {
    public static  int resta(int a, int b){
        return a-b;
    }
    public static int suma(int a, int b){
        return a+b;
    }
    static int c=suma(3,5) - resta(1,3);

    public static void main(String[] args) {
        if (c>10){
            System.out.println("c es mayor que 10");

        }else if(c>1){
            System.out.println("c es ayor que 1");
        }

        else System.out.println("c es menor que 10");

        System.out.println(c);


    }

}
