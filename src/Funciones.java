
public class Funciones {
    /**
     * ESTA FUNCION RESTA DOS NUMEROS DE TIPO INT
     * */

    public static  int resta(int a, int b){
        return a-b;
    }
    /**
     * ESTA FUNCION HACE UNA CONVERSION DE MONEDAS
     * NECESITA DOS DATOS LA CANTIDAD Y UNA MONEDA Y ESTA DEVULVE UN RESULTADO DE ACUERDO A LA MONEDA ESCOGIDA
     * PARA ESO SE UTILIZA UNA SENTENCIA DE CONTROL TIPO SWITCH
     * Y LA CANTIDAD*/
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
