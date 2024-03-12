public class Funciones {
    public static  int resta(int a, int b){
        return a-b;
    }
    public static double ConvertirCoin(double cantitad, String moneda){
        switch (moneda){
            case "COP":
                cantitad *= 4300;
                break;
            case "mex":
                cantitad *=0.5656;
                break;


        }
        return cantitad;
    }



    public static void main(String[] args) {

        System.out.println(ConvertirCoin(23, "COP"));


    }

}
